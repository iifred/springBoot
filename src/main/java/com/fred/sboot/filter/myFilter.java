package com.fred.sboot.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * 自定义的过滤拦截器
 */
public class myFilter implements Filter {
    Logger loggerFactory = LoggerFactory.getLogger(myFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        loggerFactory.info("myfile process");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
