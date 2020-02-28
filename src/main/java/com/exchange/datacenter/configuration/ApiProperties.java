package com.exchange.datacenter.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiProperties {

//    @Value("${data.mock.flag}")
    private String dataMockFlag = "true";


    public boolean isDataMockFlag() {
        return Boolean.valueOf(dataMockFlag);
    }

    public String getDataMockFlag() {
        return dataMockFlag;
    }

    public void setDataMockFlag(String dataMockFlag) {
        this.dataMockFlag = dataMockFlag;
    }
}
