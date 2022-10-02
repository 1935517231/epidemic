package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;

import com.example.epidemic.dto.UserNucleateDto;
import com.example.epidemic.excel.UserNucleateExcel;
import com.example.epidemic.service.Interface.UserNucleateService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/5 15:11
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/nucleate/")
public class UserNucleateController {

    @Autowired
    private UserNucleateService service;
    @RequestMapping("add.do")
    public ResultBean add(UserNucleateDto userNucleateDto) {
        return service.add(userNucleateDto);


    }

    //删除
    @PostMapping("del.do")
    public ResultBean del(int id){
        return service.del(id);
    }

    //查询 条件
    @GetMapping("pagewhere.do")
    public PageBean page(String name, int page, int limit){
        System.out.println("pagewhere");
        return service.queryPageWhere(name,page,limit);
    }
    //批量删除 JSON格式的数据请求
    @PostMapping("delbatch.do")
    public ResultBean del(@RequestBody int[] ids){
        return service.delBatch(ids);
    }

    @GetMapping("downAll.do")
    public void down(HttpServletResponse response) throws IOException {
        //1.查询数据
        List<UserNucleateExcel> list=service.queryAll();
        //2.设置响应消息头
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),UserNucleateExcel.class).
                sheet("自动导出").doWrite(list);
    }
}
