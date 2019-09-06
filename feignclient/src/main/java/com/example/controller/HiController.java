package com.example.controller;

import com.example.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class HiController {
    @Autowired
    HiService hiService;

    @RequestMapping("hi")
    public String sayHi(@RequestParam(defaultValue = "lxm",required = false)String home){

        return hiService.sayHi(home);
    }
}
