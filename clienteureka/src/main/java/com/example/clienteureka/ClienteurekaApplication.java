package com.example.clienteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ClienteurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClienteurekaApplication.class, args);
    }

}
