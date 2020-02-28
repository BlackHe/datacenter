package com.exchange.datacenter.intercepter;

import com.exchange.datacenter.mock.Mock;
import com.exchange.datacenter.mock.MockDataGenerater;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

@Component
public class MockInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==preHandle===");
        if (!(handler instanceof HandlerMethod)){
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        boolean needMock = method.isAnnotationPresent(Mock.class);
        if (!needMock){
            return true;
        }
        Mock mock = method.getAnnotation(Mock.class);
        Class type = mock.type();
        List list = MockDataGenerater.generateMockData(type);
        System.out.println("mock data size = "+list.size());
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
