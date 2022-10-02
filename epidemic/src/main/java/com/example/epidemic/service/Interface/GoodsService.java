package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.Goods;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GoodsService {
//    查询
    PageBean selectAll(int page, int limit);
//    新增
    ResultBean add(Goods goods);
//    修改
    ResultBean update(Goods goods);
//    删除
    ResultBean delete(int g_id);
//    模糊查询
    PageBean selectWhere(String g_name,int g_tid,int page,int limit);
//    批量删除
    ResultBean deleteBatch(int[] ids);
//    查询库存
    PageBean selectCount(String name,int count,int page,int limit);
//    修改库存
    ResultBean updateCount(String name,int count);
//    新增新的物资信息   采购
    ResultBean addByPurchase(String name, int count, String unit,
                             int tid);
    //    修改库存
    ResultBean updateCountByPurchase(String name,int count);
//    批量导入，新增
    ResultBean addBatch(MultipartFile file) throws Exception;

}
