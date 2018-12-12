package com.springcloud.test.providetwo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.test.providetwo.dao.NBookDao;
import com.springcloud.test.providetwo.entity.BasePage;
import com.springcloud.test.providetwo.entity.NBookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NBookServiceImpl implements NBookService {

    private NBookDao nBookDao;

    @Autowired
    public NBookServiceImpl(NBookDao nBookDao) {
        this.nBookDao = nBookDao;
    }

    @Override
    public int saveNBook(NBookEntity nBookEntity) {
        return nBookDao.insertNBook(nBookEntity);
    }

    @Override
    public List<NBookEntity> queryNBook(String nBookEntityParam) {
        NBookEntity nBookEntity = new NBookEntity();
        nBookEntity.setNbookName(nBookEntityParam);
        return nBookDao.selectNBook(nBookEntity);
    }

    @Override
    public PageInfo queryNBookByPage(BasePage basePage) {

        Page<List<NBookEntity>> pageResult = PageHelper.startPage(basePage.getPage(),basePage.getPageSize());
        List<NBookEntity> result = nBookDao.selectNBook(null);
        PageInfo<NBookEntity> page = new PageInfo<>(result);
        return page;
    }
}
