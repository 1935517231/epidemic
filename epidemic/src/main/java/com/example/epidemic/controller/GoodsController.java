package com.example.epidemic.controller;


import com.example.epidemic.entity.Goods;
import com.example.epidemic.service.Interface.GoodsService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/api/goods/")
@RestController
public class GoodsController {

    @Autowired
    private GoodsService service;
    //查询
    @GetMapping("selectAll.do")
    public PageBean select(int page, int limit) {
        return service.selectAll(page, limit);
    }
    //新增方法
    @PostMapping("add.do")
    public ResultBean add(Goods goods) {return service.add(goods);}
//    修改
    @PostMapping("update.do")
    public ResultBean update(Goods goods) {
            return service.update(goods);
    }
    //    删除
    @PostMapping("delete.do")
    public ResultBean delete(int g_id) {return service.delete(g_id);}
//    模糊查询
    @GetMapping("selectWhere.do")
    public PageBean page(String g_name,int g_tid,int page,int limit){
        return service.selectWhere(g_name,g_tid,page,limit);
    }
    //批量删除 JSON格式的数据请求
    @PostMapping("deletebatch.do")
    public ResultBean deleteBatch(@RequestBody int[] ids){return service.deleteBatch(ids);}

//    查询库存
    @GetMapping("selectCount.do")
    public PageBean selectCount(String name,int count,int page,int limit){
        return service.selectCount(name,count,page,limit);
    }

//    修改库存
    @PostMapping("updateCount.do")
    public ResultBean updateCount(String name,int count) {
        return service.updateCount(name,count);
    }

    //新增方法  采购
    @PostMapping("addByPurchase.do")
    public ResultBean addByPurchase(String name, int count, String unit, int tid) {
        return service.addByPurchase(name,count, unit,tid);
    }
    //    修改库存
    @PostMapping("updateCountByPurchase.do")
    public ResultBean updateCountByPurchase(String name,int count) {
        return service.updateCountByPurchase(name,count);
    }

    //数据导入，Excel上传-解析-批量新增
    @RequestMapping("upload.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        System.out.println("批量导入");
        System.out.println(file);
        return service.addBatch(file);
    }
}
