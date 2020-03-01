package com.exchange.datacenter.configuration;

import com.exchange.datacenter.properties.PropertiesHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockFlagConfiguration {

    @Autowired
    private PropertiesHolder propertiesHolder;

    public boolean isMock(){
        return Boolean.valueOf(propertiesHolder.getEnableMock());
    }

    public void open(){
        propertiesHolder.setEnableMock("true");
    }

    public void close(){
        propertiesHolder.setEnableMock("false");
    }
}
