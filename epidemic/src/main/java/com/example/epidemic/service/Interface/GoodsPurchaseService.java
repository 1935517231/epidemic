package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.GoodsPurchase;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;

public interface GoodsPurchaseService {
    //    查询  搜索
    PageBean selectWhere(String gp_admin, String gp_gname, int page, int limit);
    //    新增
    ResultBean add(GoodsPurchase goodsPurchase);
    //    批量删除
    ResultBean deleteBatch(int[] ids);
    //    删除
    ResultBean delete(int gp_id);
    //    修改
    ResultBean update(GoodsPurchase goodsPurchase);
}
