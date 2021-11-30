package com.example.demoweb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemowebController {

    String foo= System.getenv("USER");

    @GetMapping("/")
    public String home() {
        return "Hello "+foo;
    }

}
