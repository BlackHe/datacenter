package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.bean.CompanyInput;
import com.exchange.datacenter.mock.Mock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/company/input")
public class CompanyInputController {

    @RequestMapping("")
    @Mock(type = CompanyInput.class)
    public BaseResponse getCompanyInput(@RequestParam String coinName, @RequestParam String clientId,
                                    @RequestParam String startDate, @RequestParam String endDate){

        // TODO
        return null;
    }
}
