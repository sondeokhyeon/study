package com.project.toy.api.api_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "")
public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        return "hello";
    }
    
    
}
