package com.qa.web;

import com.qa.service.MathSub;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
        MathSub mathSub = new MathSub();
        System.out.println(mathSub.sub(5, 3));
    }

}
