package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.GoodsApprove;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;

public interface GoodsApproveService {
    //    查询  搜索
    PageBean selectWhere(String username, String goodsname, int page, int limit);
    //    新增
    ResultBean add(GoodsApprove goodsApprove);
    //    批量删除
    ResultBean deleteBatch(int[] ids);
    //    删除
    ResultBean delete(int id);
    //    修改
    ResultBean update(GoodsApprove goodsApprove);
}
