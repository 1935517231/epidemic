package com.example.epidemic.controller;


import com.example.epidemic.entity.GoodsApprove;
import com.example.epidemic.service.Interface.GoodsApproveService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/goodsapprove/")
@RestController
public class GoodsApproveController {
    @Autowired
    private GoodsApproveService service;

    //    模糊查询
    @GetMapping("selectWhere.do")
    public PageBean page(String username, String goodsname, int page, int limit){
        return service.selectWhere(username,goodsname,page,limit);
    }

    //新增方法
    @PostMapping("add.do")
    public ResultBean add(GoodsApprove goodsApprove) {
        return service.add(goodsApprove);
    }

    //批量删除 JSON格式的数据请求
    @PostMapping("deletebatch.do")
    public ResultBean deleteBatch(@RequestBody int[] ids){return service.deleteBatch(ids);}

    //    删除
    @PostMapping("delete.do")
    public ResultBean delete(int id) {return service.delete(id);}

    //    修改
    @PostMapping("update.do")
    public ResultBean update(GoodsApprove goodsApprove) {return service.update(goodsApprove);}

}
