package com.zx.test_login2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/****
 *
 *   @date 9/25/2019
 *   @author zixian
 */
@Controller
public class controller {
    @RequestMapping(value = "/")
    public String load(){
        return "test";
    }

    @RequestMapping(value = "/login")
    public String loadLoginPage(){return "index";}

}
