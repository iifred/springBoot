package com.fred.sboot.config;

import com.fred.sboot.component.myLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class myWebMvcConfigConfigurer implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }


    /**
     * 配置自己配置的全局国际化语言包
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){
        return  new myLocaleResolver();
    }
}
