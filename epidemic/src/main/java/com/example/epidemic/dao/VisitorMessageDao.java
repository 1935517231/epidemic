package com.example.epidemic.dao;


import com.example.epidemic.entity.VisitorMessage;
import com.example.epidemic.excel.VisitorMessageExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface VisitorMessageDao {
    /**
     新增方法
     */
    int add(VisitorMessage visitorMessage);
    /**
    查询
     */
    List<VisitorMessage> selectAll();
    /**
     * 删除
     */
    int delMessage(int id);
    /**
     * 批量删除
     */
    int delBatch(int[] ids);
    /**
     * 查询搜索条件
     */
    List<VisitorMessage> selectWhere(@Param("name") String name);
    /**
     导入
     */
    int addBatch(List<VisitorMessageExcel> list);
}
