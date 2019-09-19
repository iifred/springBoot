package com.fred.sboot.config;

import com.fred.sboot.filter.myFilter;
import com.fred.sboot.listener.myListener;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import javax.servlet.Servlet;
import javax.servlet.ServletRegistration;
import java.util.Arrays;

//服务组件配置
@Configuration
public class myServerConfig {
    //注册三大组件
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servletServletRegistrationBean = new ServletRegistrationBean(new com.fred.sboot.servlet.myServlet(),"/myservlet");
        return servletServletRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new myFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/hello","/myservlet"));
        return registrationBean;

    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<myListener> servletListenerRegistrationBean = new ServletListenerRegistrationBean<>(new myListener());
        return servletListenerRegistrationBean;
    }



    ///定制嵌入式的serverlet容器
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return  new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            //定制嵌入式的serverlet容器相关的规则
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(3030);
            }
        };
    }
}
