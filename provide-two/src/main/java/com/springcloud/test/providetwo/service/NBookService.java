package com.springcloud.test.providetwo.service;

import com.github.pagehelper.PageInfo;
import com.springcloud.test.providetwo.entity.BasePage;
import com.springcloud.test.providetwo.entity.NBookEntity;

import java.util.List;

public interface NBookService {
    public int saveNBook(NBookEntity nBookEntity);
    public List<NBookEntity> queryNBook(String nBookEntity);
    public PageInfo queryNBookByPage(BasePage basePage);
}
