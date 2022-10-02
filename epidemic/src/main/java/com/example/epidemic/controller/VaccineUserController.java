package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;

import com.example.epidemic.entity.VaccineUser;
import com.example.epidemic.service.Interface.VaccineUserService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/vaccineUser")
public class VaccineUserController {


    @Autowired
    private VaccineUserService vaccineUserService;

    //查询所有 and 条件查询
    @GetMapping ("/findAll.do")
    public PageBean<VaccineUser> findAll(@RequestParam() Integer page, Integer limit, VaccineUser vaccineUser) {
        return vaccineUserService.finAll(page, limit, vaccineUser);

    }

    //增加
    @PostMapping("/save.do")
    public ResultBean insert(VaccineUser vaccineUser) {
        return vaccineUserService.save(vaccineUser);

    }

    //删除 byID
    @GetMapping("/delete.do")
    public ResultBean delete(Integer id) {
        return vaccineUserService.delete(id);
    }

    //批量删除
    @PostMapping("/deleteBatch.do")
    public ResultBean delete(@RequestBody int[] ids) {
        return vaccineUserService.deleteBatch(ids);
    }

    //修改
    @PostMapping("/update.do")
    public ResultBean update(VaccineUser vaccineUser) {

        return vaccineUserService.update(vaccineUser);
    }

    //查询未接种
    @GetMapping("/findnot.do")
    public PageBean<VaccineUser> findNot(Integer page, Integer limit, VaccineUser vaccineUser) {
        return vaccineUserService.findNot(page, limit, vaccineUser);
    }
    //导出
    @GetMapping("/download.do")
    public void downLoad(HttpServletResponse response) throws IOException {
        //1.查询数据
        List<VaccineUser> list=vaccineUserService.findAll();
        //2.设置响应消息头
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),VaccineUser.class).
                sheet("自动导出").doWrite(list);
    }

    //导入
    @RequestMapping("/export.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        return vaccineUserService.addBatch(file);
    }

    @GetMapping("/ymTotal.do")
    public ResultBean ymTotal(){
       return ResultBean.ok(vaccineUserService.ymTotal())  ;
    }

}
