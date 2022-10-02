package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;

import com.example.epidemic.entity.VisitorMessage;
import com.example.epidemic.service.Interface.VisitorMessageService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/api/visitormessage/")
@RestController
public class VisitorMessageController {
    @Autowired
    private VisitorMessageService service;
    //新增
    @PostMapping("add.do")
    public ResultBean add(VisitorMessage visitorMessage) {
        return service.add(visitorMessage);
    }
    //查询
    @GetMapping("selectAll.do")
    public List<VisitorMessage> select() {
        return service.selectAll();
    }
    //删除
    @DeleteMapping("del.dao")
    public ResultBean del(int id){
        return service.del(id);
    }
    //新增

    //查询 条件
    @GetMapping("pagewhere.do")
    public PageBean page(String name, int page, int limit){
        return service.queryPageWhere(name,page,limit);
    }
    //删除选中
    @DeleteMapping("delbatch.do")
    public ResultBean del(@RequestBody int[] ids){
        return service.delBatch(ids);
    }

    //数据导出  下载
    @GetMapping("downall.do")
    public void down(HttpServletResponse response) throws Exception {
        List<VisitorMessage> list = service.selectAll();
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),VisitorMessage.class).
                sheet("留言列表").doWrite(list);
    }

    //数据导入
    @RequestMapping("upload.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        return service.addBatch(file);
    }
}
