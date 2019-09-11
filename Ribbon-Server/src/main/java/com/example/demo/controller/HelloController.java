package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService service;

    @RequestMapping(value = "/hi")
    public String getHello(){
        return service.getHelloWorld();
    }

    @RequestMapping(value = "/test")
    public String test(){
        return "this is test";
    }
}
