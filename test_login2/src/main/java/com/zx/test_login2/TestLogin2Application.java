package com.zx.test_login2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//阻止springboot 自动注入datasource
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class TestLogin2Application {

    public static void main(String[] args) {
        SpringApplication.run(TestLogin2Application.class, args);
    }

}
