package com.kang.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    J接口
    @RequestMapping("/hello")
    public String hello(){
        return "hello,world";
    }

}
