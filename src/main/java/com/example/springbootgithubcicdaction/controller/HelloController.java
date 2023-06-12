package com.example.springbootgithubcicdaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {


    @GetMapping("/test")
    public String test(){
        return "This is spring boot github action project!";
    }
}
