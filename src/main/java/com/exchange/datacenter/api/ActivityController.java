package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.Activity;
import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.mock.Mock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/activity")
public class ActivityController {


    @RequestMapping("")
    @Mock(type = Activity.class)
    public BaseResponse getActivity(@RequestParam String coinName, @RequestParam String clientId,
                                      @RequestParam String startDate, @RequestParam String endDate){

        // TODO
        return null;
    }

}
