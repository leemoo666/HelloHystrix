package com.example;

import com.example.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "eureka-client",path = "hi",
        configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @GetMapping("home")
    String sayHiFromClientEureka(@RequestParam(value = "home")String home);
}
