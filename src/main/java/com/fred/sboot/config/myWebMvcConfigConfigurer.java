package com.fred.sboot.config;

import com.fred.sboot.component.loginHandlerInterceptor;
import com.fred.sboot.component.myLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class myWebMvcConfigConfigurer implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/main").setViewName("dashboard");
    }


    /**
     * 配置自己配置的全局国际化语言包
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){
        return  new myLocaleResolver();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new loginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/login","/user/login").excludePathPatterns("/asserts/**");
    }
}
