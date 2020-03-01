package com.exchange.datacenter.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesHolder {

    @Value("${mock.enabled}")
    private volatile String enableMock;

    public String getEnableMock() {
        Runnable runnable = () -> { System.out.println("1212");};
        return enableMock;
    }

    public void setEnableMock(String enableMock) {
        this.enableMock = enableMock;
    }
}
