package com.fred.sboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class HelloController {
    private Logger logger= LoggerFactory.getLogger(HelloController.class);

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

        List<String> l = new ArrayList<>();
        l.addAll(0, Arrays.asList("1","2","3"));
        Iterator<String> i = l.iterator();
        while (i.hasNext()){
            logger.info(i.next());
        }
        return "hello";
    }
}
