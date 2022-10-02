package com.example.epidemic.controller;


import com.example.epidemic.entity.GoodsLog;
import com.example.epidemic.service.Interface.GoodsLogService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/goodslog/")
@RestController
public class GoodsLogController {
    @Autowired
    private GoodsLogService service;

    //    模糊查询
    @GetMapping("selectWhere.do")
    public PageBean page(String username, String goodsname, int page, int limit){
        return service.selectWhere(username,goodsname,page,limit);
    }

    //批量删除 JSON格式的数据请求
    @PostMapping("deletebatch.do")
    public ResultBean deleteBatch(@RequestBody int[] ids){return service.deleteBatch(ids);}

    //    删除
    @PostMapping("delete.do")
    public ResultBean delete(int id) {return service.delete(id);}


    //新增方法
    @PostMapping("add.do")
    public ResultBean add(GoodsLog goodsLog) {
        return service.add(goodsLog);
    }

}
