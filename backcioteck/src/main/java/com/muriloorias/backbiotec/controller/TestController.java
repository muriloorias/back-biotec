package com.muriloorias.backbiotec.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestController {
    @GetMapping("/helloWorld")
    public String getMethodName(){
        return "hello world";
    }
    
}
