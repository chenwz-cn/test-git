package com.example.test.git.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String test(){
        System.out.println("success-1");
        System.out.println("aaa");
        System.out.println("bbb");
        return "success";
    }
}
