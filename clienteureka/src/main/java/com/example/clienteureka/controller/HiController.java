package com.example.clienteureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class HiController {
    @Value("${server.port}")
    String port;

    @GetMapping("home")
    public String home(String home) {
        return "hi " + home + ",i am from port:" + port;
    }
}
