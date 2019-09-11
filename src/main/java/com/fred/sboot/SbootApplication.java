package com.fred.sboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

//@ImportResource(value = {"classpath:beans.xml"}) 指定导入配置文件路径
@SpringBootApplication
public class SbootApplication {
    public static Logger looger= LoggerFactory.getLogger(SbootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SbootApplication.class, args);
//        looger.trace("这是trace日志");
//        looger.debug("调试信息日志");
//        looger.info("自定义info日志");
//        looger.warn("这是warn日志");
//        looger.error("这是error日志");
    }

    @Bean
    public ViewResolver myResolver(){
        return  new MyResolver();
    }

    public static class MyResolver implements ViewResolver {
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }

}
