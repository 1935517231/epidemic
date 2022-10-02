package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.GoodsLog;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;

public interface GoodsLogService {
    //    查询  搜索
    PageBean selectWhere(String username, String goodsname, int page, int limit);
    //    批量删除
    ResultBean deleteBatch(int[] ids);
    //    删除
    ResultBean delete(int id);
    //    新增
    ResultBean add(GoodsLog goodsLog);
}
