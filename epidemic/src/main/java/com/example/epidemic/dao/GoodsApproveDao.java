package com.example.epidemic.dao;

import com.example.epidemic.entity.GoodsApprove;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface GoodsApproveDao {
    //    查询
    List<GoodsApprove> selectWhere(@Param("username") String username, @Param("goodsname")String goodsname);

    //    新增
    int add(GoodsApprove goodsApprove);

    //    批量删除
    int deleteBatch(int[] ids);

    //    删除
    int delete(int id);

    //    修改
    int update(GoodsApprove goodsApprove);
}
