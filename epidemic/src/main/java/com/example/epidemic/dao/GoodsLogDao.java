package com.example.epidemic.dao;



import com.example.epidemic.entity.GoodsLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GoodsLogDao {
    //    查询
    List<GoodsLog> selectWhere(@Param("username") String username, @Param("goodsname")String goodsname);

    //    批量删除
    int deleteBatch(int[] ids);

    //    删除
    int delete(int id);

    //    新增
    int add(GoodsLog goodsLog);
}
