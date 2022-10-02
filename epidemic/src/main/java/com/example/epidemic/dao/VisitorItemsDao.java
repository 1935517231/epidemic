package com.example.epidemic.dao;


import com.example.epidemic.entity.VisitorItems;
import com.example.epidemic.excel.VisitorItemsExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface VisitorItemsDao {
    /**
     新增方法
     */
    int add(VisitorItems visitorItems);

    /**
     查询方法
     */
    List<VisitorItems> selectAll();
    /**
     删除
     */
    int del(int id);
    /**
     批量删除
     */
    int delBatch(int[] ids);
    /**
     修改
     */
    int update(VisitorItems visitorItems);
    /**
     查询搜索条件
     */
    List<VisitorItems> selectWhere(@Param("name") String name);
    /**
     导入
     */
    int addBatch(List<VisitorItemsExcel> list);
}
