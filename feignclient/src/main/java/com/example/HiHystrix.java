package com.example;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String home) {
        return "hi error :"+home+",sorry!!!";
    }
}
