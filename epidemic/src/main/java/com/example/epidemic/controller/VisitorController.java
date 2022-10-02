package com.example.epidemic.controller;


import com.alibaba.excel.EasyExcel;

import com.example.epidemic.entity.Visitor;
import com.example.epidemic.service.Interface.VisitorService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/api/visitor/")
@RestController
public class VisitorController {
    @Autowired
    private VisitorService service;

    //新增方法
    @PostMapping("add.do")
    public ResultBean add(Visitor visitor) {
            return service.add(visitor);
        }

    //查询
    @GetMapping("selectAll.do")
    public List<Visitor> select() {
        return service.selectAll();
    }

    //修改
    @PostMapping("update.do")
    public ResultBean update(Visitor visitor){
        return service.update(visitor);
    }

    //删除
    @PostMapping("del.do")
    public ResultBean del(int id){
        return service.del(id);
    }

    //查询 条件
    @GetMapping("pagewhere.do")
    public PageBean page(String name, int page, int limit){
        return service.queryPageWhere(name,page,limit);
    }

    //批量删除 JSON格式的数据请求
    @PostMapping("delbatch.do")
    public ResultBean del(@RequestBody int[] ids){
        return service.delBatch(ids);
    }

    //数据导出  下载
    @GetMapping("downall.do")
    public void down(HttpServletResponse response) throws Exception {
        List<Visitor> list = service.selectAll();
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),Visitor.class).
                sheet("访客列表").doWrite(list);
    }

    //数据导入
    @RequestMapping("upload.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        return service.addBatch(file);
    }
    //查询访客的总个数
    @GetMapping("totalVisitor.do")
    public ResultBean selectTotal() {
        return ResultBean.ok(service.selectTotal());
    }

    @RequestMapping("selectTj.do")
    public ResultBean selectTj() {
        return ResultBean.ok(service.selectTj());
    }

}
