package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.Assert;
import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.configuration.ApiProperties;
import com.exchange.datacenter.mock.Mock;
import com.exchange.datacenter.mock.MockDataGenerater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/assert")
public class AssertController{


    @Autowired
    private ApiProperties apiProperties;

    @RequestMapping("")
    @Mock(type = Assert.class)
    public BaseResponse getAssert(@RequestParam String coinName, @RequestParam String clientId) {
        if (apiProperties.isDataMockFlag()) {
            System.out.println("------返回mock数据------");
            return BaseResponse.responseOf(MockDataGenerater.assertList());
        }
        System.out.println("------返回真实数据------");
        return doGetRealData(coinName,clientId);
    }

    public BaseResponse doGetRealData(String coinName,String clientId) {
        // TODO
        return null;
    }



}
