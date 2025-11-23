package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @GetMapping("/api/greeting")
    public String apiGreeting() {
        return "Hello from Spring Boot API!";
    }
}
