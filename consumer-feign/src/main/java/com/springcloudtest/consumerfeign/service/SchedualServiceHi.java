package com.springcloudtest.consumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value="PROVIDE-ONE")
public interface SchedualServiceHi {

    @RequestMapping(value="/getPortRest",method=RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value="name")String name);
}
