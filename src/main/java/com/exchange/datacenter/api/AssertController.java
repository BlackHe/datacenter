package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.Assert;
import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.mock.Mock;
import com.exchange.datacenter.mock.MockDataGenerater;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/assert")
public class AssertController{

    @RequestMapping("")
    @Mock(type = Assert.class)
    public BaseResponse getAssert(@RequestParam String coinName, @RequestParam String clientId) {
        System.out.println("======返回真实数据======");
        return BaseResponse.responseOf(MockDataGenerater.assertList());
    }



}
