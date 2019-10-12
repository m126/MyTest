package com.zx.test_login2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/****
 *
 *   @date 9/25/2019
 *   @author zixian
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @RequestMapping(value = "/")
    public String load(){
        return "test";
    }

    @RequestMapping(value = "/login")
    public String loadLoginPage(){return "index";}

    @RequestMapping(value = "/testLogin")
    public String testLogin(){
        System.out.println("controller..........");
        return "testLogin";
    }

    @RequestMapping(value = "/loginTestPage")
    public String testPage(HttpServletRequest request){
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        System.out.println("name:"+name);
        System.out.println("pwd:"+pwd);
        //
        request.getSession().setAttribute("name", name);
        request.getSession().setAttribute("pwd", pwd);





        return "testPage";
    }

    @RequestMapping(value = "/loadPageData")
    public @ResponseBody Map<String,Object> LoadPageData(HttpServletRequest request){
        String myname = request.getParameter("myname");
        System.out.println(myname);
        Map<String,Object> map = new HashMap<>();
        map.put("map", "call ajax success");
        return map;
    }


}
