package com.example.aop.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;

/****
 *
 *   @date 9/2/2019
 *   @author zixian
 */
@Controller
public class AspectTestController {


    public void Hello(){
        System.out.println("hello start");
    }

    public void Hello2(){}
}
