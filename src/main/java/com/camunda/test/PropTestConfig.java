package com.camunda.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "service")
public class PropTestConfig {

    private String element;

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }
}
