package com.fred.sboot.config;

import com.fred.sboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myApplicationConfig {
    @Bean
    public HelloService helloService1(){
        System.out.println("初始化bean容器");
        return new HelloService();
    }
}
