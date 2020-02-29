package com.exchange.datacenter.configuration;

import com.exchange.datacenter.intercepter.MockInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class IntercepterConfiguration extends WebMvcConfigurationSupport {

    @Autowired
    private MockInterceptor mockInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mockInterceptor);
        super.addInterceptors(registry);
    }
}
