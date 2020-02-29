package com.exchange.datacenter.intercepter;

import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.configuration.MockFlagConfiguration;
import com.exchange.datacenter.mock.Mock;
import com.exchange.datacenter.mock.MockDataGenerater;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;

@Component
public class MockInterceptor implements HandlerInterceptor {


    @Autowired
    private MockFlagConfiguration mockFlagConfiguration;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)){
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        if (!needMock(method)){
            System.out.println("return real data");
            return true;
        }
        Class type = method.getAnnotation(Mock.class).type();
        List list = MockDataGenerater.generateMockData(type);
        System.out.println("return mock data, size = " + (list == null ? 0 : list.size()));
        final PrintWriter writer = response.getWriter();
        writer.print(buildMockResponse(list));
        writer.close();
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    private boolean needMock(Method method){
        return mockFlagConfiguration.isMock() && method.isAnnotationPresent(Mock.class);
    }

    private String buildMockResponse(List list){
        BaseResponse response = BaseResponse.responseOf(list);
        ObjectMapper objectMapper = new ObjectMapper();
        String result = "";
        try {
            result = objectMapper.writeValueAsString(response);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
