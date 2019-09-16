package com.fred.sboot.controller;

import com.fred.sboot.exception.UserNotExit;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

//异常处理器
@ControllerAdvice
public class MyExceptionHandler {
    //1:浏览器和客户端返回的都是json
//    @ResponseBody
//    @ExceptionHandler(UserNotExit.class)
//    public Map<String,Object> handleException(Exception e){
//        Map<String, Object> map = new HashMap<>();
//        map.put("code","user.notexist");
//        map.put("message", e.getMessage());
//        return map;
//    }
    @ExceptionHandler(UserNotExit.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        //传入自己的错误状态码，否则不会进入自己的错误页面
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user.notexist");
        map.put("message", e.getMessage());
        request.setAttribute("ext",map);
        return "forward:/error";
    }
}
