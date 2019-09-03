package com.fred.sboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(value = {"classpath:beans.xml"}) 指定导入配置文件路径
@SpringBootApplication
public class SbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbootApplication.class, args);
    }

}
