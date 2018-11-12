package com.springcloudtest.consumerfeign.Controller;

import com.springcloudtest.consumerfeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    //编译器报错，无视，因为这个Bean是在程序启动时候注入的，斌一起感知不到，所以报错
    @Autowired
    SchedualServiceHi schedualServiceHi;

    /**
     * http://localhost:8821/hi?name=a
     * @param name
     * @return
     */
    @GetMapping(value="/hi")
    public String sayHi(@RequestParam String name){
        return "feign="+schedualServiceHi.sayHiFromClient(name);
    }



}
