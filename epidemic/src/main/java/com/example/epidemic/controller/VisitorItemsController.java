package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;

import com.example.epidemic.entity.VisitorItems;
import com.example.epidemic.service.Interface.VisitorItemsService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/api/visitoritems/")
@RestController
public class VisitorItemsController {
    @Autowired
    private VisitorItemsService service;

    //新增方法
    @PostMapping("add.do")
    public ResultBean add(VisitorItems visitorItems) {
        return service.add(visitorItems);
    }

    //查询
    @GetMapping("selectAll.do")
    public List<VisitorItems> select() {
        return service.selectAll();
    }

    //修改
    @PostMapping("update.do")
    public ResultBean update(VisitorItems visitorItems){
        return service.update(visitorItems);
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
        List<VisitorItems> list = service.selectAll();
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),VisitorItems.class).
                sheet("物资列表").doWrite(list);
    }

    //数据导入
    @RequestMapping("upload.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        return service.addBatch(file);
    }
}
