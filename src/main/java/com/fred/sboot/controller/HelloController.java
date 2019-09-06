package com.fred.sboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping(value = "hello")
    @ResponseBody
    public String hello(){
        return "fred";
    }

    @RequestMapping("success")
    public String thypageHello(Map<String,Object> map){
        map.put("hello", "刘志飞");
        map.put("users", Arrays.asList("fred","rain","jerry"));
        map.put("msg","<h1>万岁</h1>");
        return "hello";
    }
}
