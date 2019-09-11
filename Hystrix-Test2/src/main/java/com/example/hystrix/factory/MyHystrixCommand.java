package com.example.hystrix.factory;

import com.netflix.hystrix.Hystrix;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class MyHystrixCommand extends HystrixCommand {
    /*
    由于继承HystrixCommand 的类没有交给spring 进行管理，所以无法进行注入,做法如下
    @Autowired
    RestTemplate restTemplate;*/

    /* protected MyHystrixCommand(HystrixCommandGroupKey group) {
        super(group);
    }*/

    private RestTemplate  restTemplate;

    public MyHystrixCommand(String groupKey, RestTemplate restTemplate) {
        super(HystrixCommandGroupKey.Factory.asKey(groupKey));
        this.restTemplate = restTemplate;
    }

    @Override
    protected Object run() throws  Exception{
        System.out.println(Thread.currentThread().getName());
        return restTemplate.getForObject("http://SERVICE-HI/hi",String.class);
    }

    @Override
    protected Object getFallback() {
        return"Error!!!      We are sorry that this has happened";
    }
}
