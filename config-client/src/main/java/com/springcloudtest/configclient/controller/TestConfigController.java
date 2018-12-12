package com.springcloudtest.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/config")
public class TestConfigController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value="/hi",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String hi(){
        System.out.println("This result is "+foo);
        return foo;
    }
}
