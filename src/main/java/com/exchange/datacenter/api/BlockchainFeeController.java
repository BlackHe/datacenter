package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.bean.BlockchainFee;
import com.exchange.datacenter.mock.Mock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/blockchain/fee")
public class BlockchainFeeController {


    @RequestMapping("")
    @Mock(type = BlockchainFee.class)
    public BaseResponse getBlockchainFee(@RequestParam String coinName, @RequestParam String startDate, @RequestParam String endDate){
        // TODO
        return null;
    }
}
