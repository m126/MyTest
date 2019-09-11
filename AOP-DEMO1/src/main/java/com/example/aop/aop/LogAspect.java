package com.example.aop.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/****
 *
 *   @date 9/2/2019
 *   @author zixian
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.example.aop.controller.AspectTestController.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("aspect before start.......");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("aspect after start.......");
    }

    @Around("pointcut()")
    public void around(){
        System.out.println("apscet around .........");
    }


}
