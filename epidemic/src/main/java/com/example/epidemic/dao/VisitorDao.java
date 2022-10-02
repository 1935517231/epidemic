package com.example.epidemic.dao;


import com.example.epidemic.dto.UserCountDto;
import com.example.epidemic.entity.Visitor;
import com.example.epidemic.excel.VisitorExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface VisitorDao {
    /**
     新增方法
     */
    int add(Visitor visitor);

    /**
     查询方法
     */
    List<Visitor> selectAll();
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
    int update(Visitor visitor);
    /**
     查询搜索条件
     */
    List<Visitor> selectWhere(@Param("name") String name);
    /**
     导入
     */
    int addBatch(List<VisitorExcel> list);
    /**
     查询总人数
     */
    int selectTotal();

    List<UserCountDto> selectTj();
}
