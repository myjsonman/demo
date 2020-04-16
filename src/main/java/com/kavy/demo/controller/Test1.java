package com.kavy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {

    @GetMapping("/hello")
    public String hello(){
        return "你好呀";
    }
}
