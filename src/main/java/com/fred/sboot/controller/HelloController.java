package com.fred.sboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "hello")
    public String hello(){
        return "fred hello!";
    }
}
