package com.springcloud.test.providetwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProvideTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideTwoApplication.class, args);
    }

    @Value("${server.port}")
    private String portValue;

    @GetMapping(path = "/getDemo")
    public String getDemo(@RequestParam(value = "x")String x){
        System.out.println("Hello the port is "+x);
        return "Hello the port is "+portValue;
    }

    @GetMapping(path = "/getDemos")
    public String getDemos(Ab ab){
        System.out.println("Hello the port is "+ab.toString());
        return "Hello the port is "+portValue;
    }

    @PostMapping(path = "/getDemos")
    public String getDemoss(@RequestBody Ab ab){
        System.out.println("Hello the port is "+ab.toString());
        return "Hello the port is "+portValue;
    }

    @PostMapping(path = "/getDemosa")
    public String getDemossa(RequestEntity<Ab> abs){
        Ab ab = abs.getBody();
        System.out.println("Hello the port is "+ab.toString());
        return "Hello the port is "+portValue;
    }
}
