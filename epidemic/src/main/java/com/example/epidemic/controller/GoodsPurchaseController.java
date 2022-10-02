package com.example.epidemic.controller;


import com.example.epidemic.entity.GoodsPurchase;
import com.example.epidemic.service.Interface.GoodsPurchaseService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/goodspurchase/")
@RestController
public class GoodsPurchaseController {
    @Autowired
    private GoodsPurchaseService service;

    //    模糊查询
    @GetMapping("selectWhere.do")
    public PageBean page(String gp_admin, String gp_gname, int page, int limit){
        return service.selectWhere(gp_admin,gp_gname,page,limit);
    }

    //新增方法
    @PostMapping("add.do")
    public ResultBean add(GoodsPurchase goodsPurchase) {
        return service.add(goodsPurchase);
    }

    //批量删除 JSON格式的数据请求
    @PostMapping("deletebatch.do")
    public ResultBean deleteBatch(@RequestBody int[] ids){return service.deleteBatch(ids);}

    //    删除
    @PostMapping("delete.do")
    public ResultBean delete(int gp_id) {return service.delete(gp_id);}

    //    修改
    @PostMapping("update.do")
    public ResultBean update(GoodsPurchase goodsPurchase) {return service.update(goodsPurchase);}
}
