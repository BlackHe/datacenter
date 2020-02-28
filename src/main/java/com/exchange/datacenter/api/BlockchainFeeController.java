package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.configuration.ApiProperties;
import com.exchange.datacenter.mock.MockDataGenerater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/blockchain/fee")
public class BlockchainFeeController {

    @Autowired
    private ApiProperties apiProperties;

    @RequestMapping("")
    public BaseResponse getBlockchainFee(@RequestParam String coinName, @RequestParam String startDate, @RequestParam String endDate){
        if (apiProperties.isDataMockFlag()){
            return BaseResponse.responseOf(MockDataGenerater.blockchainFeeList());
        }
        // TODO
        return null;
    }
}