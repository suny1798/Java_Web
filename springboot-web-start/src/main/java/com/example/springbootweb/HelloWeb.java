package com.example.springbootweb;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWeb {

    @RequestMapping("/hello")
    public String hello(String name) {
        System.out.println("hello "+ name);
        return "hello " + name;
    }
}
