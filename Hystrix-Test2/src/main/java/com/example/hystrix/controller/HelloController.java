package com.example.hystrix.controller;

import com.example.hystrix.factory.MyHystrixCommand;
import com.example.hystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    HelloService service;
    RestTemplate restTemplate;

    @RequestMapping(value = "/hi")
    public String sayHello(){
        return service.helloService();
    }

    /*
    * This is function's result that haven't gain correct info
    *
    * */
    @RequestMapping(value = "/hi2")
    public Object sayHello2(){ MyHystrixCommand command = new MyHystrixCommand("hello",restTemplate);
        Object result = command.execute();
        return result;
    }


}
