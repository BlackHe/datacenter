package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.AbnormalTurnedhot;
import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.mock.Mock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/abnormal/turnedhot")
public class AbnormalTurnedhotController {



    @RequestMapping("")
    @Mock(type = AbnormalTurnedhot.class)
    public BaseResponse getAbnormalTurnedhot(@RequestParam String coinName, @RequestParam String startDate, @RequestParam String endDate){
        // TODO
        return null;
    }
}
