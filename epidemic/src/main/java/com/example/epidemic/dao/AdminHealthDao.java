package com.example.epidemic.dao;



import com.example.epidemic.dto.AdminHealthDto;
import com.example.epidemic.entity.AdminHealth;
import com.example.epidemic.excel.AdminHealthExcel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/01/20:24
 * @Description:
 */
@Mapper
public interface AdminHealthDao {
    /**
     新增方法
     */
    int add(AdminHealth adminHealth);

    /**
     查询方法
     */
    List<AdminHealthDto> selectAll();

    /**
     删除方法
     */
    int del(int id);

    /**
     * 修改方法
     */
    int update(AdminHealth adminHealth);

    /**
     * 根据用户名模糊查询
     */
    List<AdminHealthDto> selectByName(String name);

    /**
     * 批量删除
     */
    int delBatch(int[] ids);

    //批量导入
    int addBatch(List<AdminHealthExcel> list);
}
