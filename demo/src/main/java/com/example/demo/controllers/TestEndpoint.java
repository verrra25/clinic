package com.example.demo.controllers;


import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestEndpoint {
    @GetMapping("/hello")
    public String returnTestString() {
        return "Hello world";
    }

    @PostConstruct
    public void init() {
        System.out.println("TestEndpoint loaded");
    }
}




