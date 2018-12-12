package com.springcloud.test.providetwo.dao;

import com.springcloud.test.providetwo.entity.NBookEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//@Mapper
public interface NBookDao {
    Integer insertNBook(NBookEntity nBookEntity);
    List<NBookEntity> selectNBook(NBookEntity nBookEntity);
}
