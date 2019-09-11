package com.example.demo.inter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SERVICE-HI")
public interface FeignInterface {

    @RequestMapping(value = "/hi")
    String sayhello();

}
