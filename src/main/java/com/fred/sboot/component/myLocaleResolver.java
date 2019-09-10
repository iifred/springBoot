package com.fred.sboot.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Locale;

/**
 * 可以在连接中携带区域信息
 */
public class myLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        Enumeration<String> enumeration= httpServletRequest.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            if(enumeration.nextElement().equals("accept-language")){
                httpServletRequest.getHeader(enumeration.nextElement());
            }
        }
        String l = httpServletRequest.getParameter("l");
        Locale locale= Locale.getDefault();
        if (!StringUtils.isEmpty(l)){
            String[] strings=l.split("_");
            locale=new Locale(strings[0],strings[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
