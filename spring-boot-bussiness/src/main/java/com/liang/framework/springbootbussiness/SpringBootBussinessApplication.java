package com.liang.framework.springbootbussiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.liang.framework"})
public class SpringBootBussinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBussinessApplication.class, args);
    }

}
