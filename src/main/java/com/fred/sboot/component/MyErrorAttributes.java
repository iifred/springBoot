package com.fred.sboot.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        map.put("company","itfred");
        Map<String,Object> map1= (Map<String, Object>) webRequest.getAttribute("ext", 0);
        map.put("ext", map1);
        return map;
    }

    @Override
    public Throwable getError(WebRequest webRequest) {
        return null;
    }
}
