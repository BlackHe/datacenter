package com.exchange.datacenter.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesHolder {

    @Value("${data.mock.flag}")
    private volatile String dataMockFlag;


    public String getDataMockFlag() {
        return dataMockFlag;
    }

    public void setDataMockFlag(String dataMockFlag) {
        this.dataMockFlag = dataMockFlag;
    }
}
