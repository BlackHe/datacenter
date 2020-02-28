package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.bean.Trade;
import com.exchange.datacenter.configuration.ApiProperties;
import com.exchange.datacenter.mock.MockDataGenerater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/trade")
public class TradeController {

    @Autowired
    private ApiProperties apiProperties;

    @RequestMapping("")
    public BaseResponse getTrade(@RequestParam String coinName, @RequestParam String clientId,
                                 @RequestParam String startDate, @RequestParam String endDate){

        if (StringUtils.isEmpty(clientId)){
            if (dayDiff(startDate,endDate) > 7){
                return BaseResponse.responseOf("10001","查询日期区间请在7天之内");
            }
        }
        if (apiProperties.isDataMockFlag()){
            return BaseResponse.responseOf(MockDataGenerater.tradeList());
        }
        return null;
    }



    private int dayDiff(String startDate,String endDate){
        return 1;
    }
}
