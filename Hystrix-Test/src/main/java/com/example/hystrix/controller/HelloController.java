package com.example.hystrix.controller;

import com.example.hystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService service;

    @RequestMapping(value = "/hi")
    public String sayHello(){
        return service.helloService();
    }


}
