package com.example.epidemic.dao;


import com.example.epidemic.entity.Goods;
import com.example.epidemic.excel.GoodsExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GoodsDao {
//      查询
    List<Goods> selectAll();
//    新增
    int add(Goods goods);
//    修改
    int update(Goods goods);
//    删除
    int delete(int g_id);
//    模糊查询
    List<Goods> selectWhere(@Param("g_name") String g_name, @Param("g_tid")int g_tid);
//    批量删除
    int deleteBatch(int[] ids);
//    查询库存是否充足
    List<Goods> selectCount(@Param("name")String name,@Param("count")int count);
//    修改物资库存    申请
    int updateCount(@Param("name")String name,@Param("count")int count);
//    新增新的物资信息 采购
    int addByPurchase(@Param("name")String name,@Param("count")int count,@Param("unit")String unit,
                      @Param("tid")int tid);
    //    修改物资库存 采购
    int updateCountByPurchase(@Param("name")String name,@Param("count")int count);
//    批量导入，新增
    int addBatch(List<GoodsExcel> list);
}
