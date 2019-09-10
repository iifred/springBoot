package com.fred.sboot.config;

import com.fred.sboot.component.myLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration

/**
 * spring boot 继承WebMvcConfigurationSupport后自动配置不生效问题
 * 所以我们只需要在自定义配置类中直接实现 * WebMvcConfigurer
 */
public class myWebMvcConfigWebMvcConfigurationSupport extends WebMvcConfigurationSupport {

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }


    /**
     * Spring Boot配置路径访问忽略大小写
     * 访问URL设置大小写不敏感
     * @param configurer
     */
    @Override
    protected void configurePathMatch(PathMatchConfigurer configurer) {
        AntPathMatcher matcher = new AntPathMatcher();
        matcher.setCaseSensitive(false);
        configurer.setPathMatcher(matcher);
    }


    //    @Bean
//    public WebMvcConfigurationSupport webMvcConfigurationSupport(){
//        WebMvcConfigurationSupport webMvcConfigurationSupport= new WebMvcConfigurationSupport(){
//            @Override
//            protected void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/login").setViewName("login");
//            }
//        };
//        return  webMvcConfigurationSupport;
//    }
}
