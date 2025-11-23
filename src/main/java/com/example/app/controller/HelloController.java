package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greet";
    }
}
