package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;

import com.example.epidemic.entity.UserOtherLocus;
import com.example.epidemic.service.Interface.UserOtherLocusService;
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
 * @Date 2022/4/2 14:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/local/")
public class UserOtherLocusController {

    @Autowired
    private UserOtherLocusService service;

    /**
     * 新增用户
     * @param userOtherLocus 封装谓otherLocus对象,
     * @return ok 或fail
     */
    @PostMapping("add.do")
    public ResultBean add(UserOtherLocus userOtherLocus) {
        //System.out.println("nihoa++++++++++");
        return service.add(userOtherLocus);
    }

    /**
     * 分页查询
     * @param page 页数
     * @param limit  分页
     * @return user集合
     */
    @GetMapping("selectAll.do")
    public PageBean selectAll(int page, int limit) {
        //System.out.println("nihao ");
        return service.selectAll(page, limit);
    }

    /**
     * 修改
     * @param userOtherLocus 对象
     * @return ok/fail
     */
    @RequestMapping("update.do")
    public ResultBean update(UserOtherLocus userOtherLocus){
        return service.update(userOtherLocus);
    }
    //删除
    @RequestMapping("del.do")
    public ResultBean del(int id){
        return service.del(id);
    }
    //查询 条件
    @GetMapping("pagewhere.do")
    public PageBean page(String name,int page,int limit){
        System.out.println("pagewhere");
        return service.queryPageWhere(name,page,limit);
    }

    /**
     * 批量删除 JSON格式的数据请求
     * @param ids id数组
     * @return
     */
    @RequestMapping("delbatch.do")
    public ResultBean del(@RequestBody int[] ids){
        return service.delBatch(ids);
    }

    //数据导出
    @GetMapping("downAll.do")
    public void down(HttpServletResponse response) throws IOException {
        //1.查询数据
        List<UserOtherLocus> list=service.queryAll();
        //2.设置响应消息头
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),UserOtherLocus.class).
                sheet("自动导出").doWrite(list);
    }
    //数据导入，Excel上传-解析-批量新增
    @RequestMapping("upload.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        System.out.println("批量导入");
        System.out.println(file);
        return service.saveBatch(file);
    }
}
