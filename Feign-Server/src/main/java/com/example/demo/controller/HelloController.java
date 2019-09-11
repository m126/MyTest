package com.example.demo.controller;

import com.example.demo.inter.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    FeignInterface feignInterface;
    @RequestMapping(value = "/hello")
    public String say(){
        return feignInterface.sayhello();
    }


}
