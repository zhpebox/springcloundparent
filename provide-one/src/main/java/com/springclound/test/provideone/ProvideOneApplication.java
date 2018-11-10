package com.springclound.test.provideone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProvideOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideOneApplication.class, args);
    }


    @Value("${server.port}")
    String port;

    @GetMapping(value="/getPortRest")
    public String getPortRest(@RequestParam(value="name")String name){
        return " this port is = "+port +" name="+name;
    }

}
