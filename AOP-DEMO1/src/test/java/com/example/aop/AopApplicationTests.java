package com.example.aop;

import com.example.aop.controller.AspectTestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.applet.AppletStub;
import java.text.MessageFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopApplicationTests {

    @Autowired
    AspectTestController aspectTestController;

    @Test
    public void contextLoads() {
        aspectTestController.Hello();
    }

    @Test
    public void test(){
        String str = "{0}123123{1}";
        Object[] params = new Object[2];
        params[0] = "qqq" ;
        params[1] = "zzz" ;
        String msg = MessageFormat.format(str,params);
        System.out.println(msg);
    }


}
