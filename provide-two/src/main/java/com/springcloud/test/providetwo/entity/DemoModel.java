package com.springcloud.test.providetwo.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data
@Alias("demoModel")
public class DemoModel implements Serializable {

    private String name;
    private int age;
}
