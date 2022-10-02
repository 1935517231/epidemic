package com.example.epidemic.dao;


import com.example.epidemic.entity.VisitorCar;
import com.example.epidemic.excel.VisitorCarExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface VisitorCarDao {
    /**
     新增方法
     */
    int add(VisitorCar visitorCar);

    /**
     查询方法
     */
    List<VisitorCar> selectAll();
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
    int update(VisitorCar visitorCar);
    /**
     查询搜索条件
     */
    List<VisitorCar> selectWhere(@Param("name") String name);
    /**
        导入
     */
    int addBatch(List<VisitorCarExcel> list);
}
