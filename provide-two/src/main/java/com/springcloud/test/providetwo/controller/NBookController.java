package com.springcloud.test.providetwo.controller;

import com.github.pagehelper.PageInfo;
import com.springcloud.test.providetwo.entity.BasePage;
import com.springcloud.test.providetwo.entity.NBookEntity;
import com.springcloud.test.providetwo.service.NBookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/nbook")
@Api("NBController")
public class NBookController {

    NBookService nBookService;

    @Autowired
    public NBookController(NBookService nBookService) {
        this.nBookService = nBookService;
    }

    @ApiOperation(value="新增图书",notes = "新增图书notes")
    @PostMapping(value="/addNew",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addNewNBook(RequestEntity<NBookEntity> entity){
        int result = nBookService.saveNBook(entity.getBody());
        return ResponseEntity.ok(result);
    }

    @ApiOperation(value="查询图书" , notes = "查询图书notes")
    @GetMapping(value="/queryNBook", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchNBook(@RequestParam(value="bookName")String entity){
        List<NBookEntity> resultList = nBookService.queryNBook(entity);
        ResponseEntity r1 = ResponseEntity.ok(resultList);
        ResponseEntity r2 = ResponseEntity.ok().body(resultList);
        return ResponseEntity.ok(resultList);
    }

    @ApiOperation(value="分页查询图书" , notes = "分页查询图书notes")
    @PostMapping(value="/queryNBookByPage", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchNBookByPage(RequestEntity<BasePage> page){
        PageInfo resultList = nBookService.queryNBookByPage(page.getBody());
        return ResponseEntity.ok(resultList);
    }

}
