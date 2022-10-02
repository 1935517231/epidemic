package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;

import com.example.epidemic.dto.UserHeatlthAdmin;
import com.example.epidemic.entity.OwnHealth;
import com.example.epidemic.excel.UserHeathExcel;
import com.example.epidemic.service.Interface.UserHeatlthService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/1 16:25
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/heatlth/")
public class UserHeatlthController {

    @Autowired
    private UserHeatlthService service;

    /**
     * 新增
     * @param
     * @return ok/fail
     */
    @RequestMapping("add.do")
    public ResultBean add(UserHeatlthAdmin userHeatlthAdmin) {
        System.out.println(userHeatlthAdmin);
        return service.add(userHeatlthAdmin);
    }
    @GetMapping("selectAll.do")
    public PageBean selectAll(int page, int limit) {

        PageBean pageBean = service.selectAll(page, limit);
        System.out.println(pageBean);
        return pageBean;
    }

    //修改
    @PostMapping("update.do")
    public ResultBean update(UserHeatlthAdmin userHeatlthAdmin){
        return service.update(userHeatlthAdmin);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("del.do")
    public ResultBean del(int id){
        return service.del(id);
    }
    //查询 条件
    @GetMapping("pagewhere.do")
    public PageBean page(String name,int page,int limit){
        System.out.println("pagewhere");

        PageBean pageBean = service.queryPageWhere(name, page, limit);
        System.out.println(pageBean);
        return pageBean;
    }
    //批量删除 JSON格式的数据请求
    @RequestMapping("delbatch.do")
    public ResultBean delBatch(@RequestBody int[] ids){
        return service.delBatch(ids);
    }

    //数据导出
    @GetMapping("downAll.do")
    public void down(HttpServletResponse response) throws IOException {
        //1.查询数据
        List<UserHeatlthAdmin> list=service.queryAll();
        //2.设置响应消息头
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(), UserHeathExcel.class).
                sheet("导出体温情况").doWrite(list);
    }
    //数据导入，Excel上传-解析-批量新增
    @RequestMapping("upload.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        System.out.println("批量导入");
        System.out.println(file);
        return service.saveBatch(file);
    }

    //用户自己上传自己的健康情况
    @PostMapping("ownHealth.do")
    public ResultBean ownHealth(OwnHealth ownHealth) {
        return service.addOwnHealth(ownHealth);
    }
    //用户自己查询
    @GetMapping("pagewhereone.do")
    public PageBean pageByOne(String name,int page,int limit){
        System.out.println("pagewhere");

        PageBean pageBean = service.queryPageByOne(name, page, limit);
        return pageBean;
    }

}
