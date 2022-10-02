package com.example.epidemic.dao;


import com.example.epidemic.entity.GoodsPurchase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GoodsPurchaseDao {
//    查询
    List<GoodsPurchase> selectWhere(@Param("gp_admin") String gp_admin, @Param("gp_gname")String gp_gname);

//    新增
    int add(GoodsPurchase goodsPurchase);

    //    批量删除
    int deleteBatch(int[] ids);

    //    删除
    int delete(int g_id);

    //    修改
    int update(GoodsPurchase goodsPurchase);
}
