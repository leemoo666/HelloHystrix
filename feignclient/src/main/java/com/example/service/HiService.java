package com.example.service;

import com.example.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String home){
        return eurekaClientFeign.sayHiFromClientEureka(home);
    }


}
