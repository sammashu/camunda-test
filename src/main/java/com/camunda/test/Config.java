package com.camunda.test;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public PropTestConfig propTestConfig(){
        return new PropTestConfig();
    }
}
