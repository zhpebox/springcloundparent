package com.springcloud.test.providetwo;

import com.springcloud.test.providetwo.entity.DemoModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

@MapperScan("com.**.dao") //或者在dao中用@Mapper注解
@SpringBootApplication
@EnableEurekaClient
@RestController
@Api("provideTwo启动类")
public class ProvideTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideTwoApplication.class, args);
    }

    @Value("${server.port}")
    private String portValue;

    @ApiOperation(value="获取Demo",notes="获取demoL")
    @GetMapping(path = "/getDemo")
    public String getDemo(@RequestParam(value = "x")String x){
        System.out.println("Hello the port is "+x);
        return "Hello the port is "+portValue;
    }

    @GetMapping(path = "/getDemos")
    public String getDemos(DemoModel demoModel){
        System.out.println("Hello the port is "+ demoModel.toString());
        return "Hello the port is "+portValue;
    }

    @PostMapping(path = "/getDemos")
    public String getDemoss(@RequestBody DemoModel demoModel){
        System.out.println("Hello the port is "+ demoModel.toString());
        return "Hello the port is "+portValue;
    }

    @ApiOperation(value="获取Demoas",notes="获取demoasL")
    @PostMapping(path = "/getDemosa")
    public String getDemossa(RequestEntity<DemoModel> abs){
        DemoModel demoModel = abs.getBody();
        System.out.println("Hello the port is "+ demoModel.toString());
        return "Hello the port is "+portValue;
    }
}
