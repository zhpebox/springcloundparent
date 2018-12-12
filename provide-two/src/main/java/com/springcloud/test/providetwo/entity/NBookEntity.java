package com.springcloud.test.providetwo.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("nbookEntity")
public class NBookEntity {
    private String nid;
    private String nbookName;
    private String nbookAuther;
    private String nbookNum;
}
