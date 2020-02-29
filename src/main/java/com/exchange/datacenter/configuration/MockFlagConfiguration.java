package com.exchange.datacenter.configuration;

import com.exchange.datacenter.properties.PropertiesHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockFlagConfiguration {

    @Autowired
    private PropertiesHolder propertiesHolder;

    public boolean isMock(){
        return Boolean.valueOf(propertiesHolder.getDataMockFlag());
    }

    public void open(){
        propertiesHolder.setDataMockFlag("true");
    }

    public void close(){
        propertiesHolder.setDataMockFlag("false");
    }
}
