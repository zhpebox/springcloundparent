package com.springcloud.test.providetwo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Ab implements Serializable {

    private String name;
    private int age;
}
