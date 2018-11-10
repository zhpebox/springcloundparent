package com.springcloudtest.consumerribbon.controller;


import com.springcloudtest.consumerribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    /**
     * http://localhost:8811/hi?name=a
     * @param name
     * @return
     */
    @RequestMapping(value="/hi")
    public String hiController(@RequestParam String name){
        return helloService.hiService(name);
    }
}
