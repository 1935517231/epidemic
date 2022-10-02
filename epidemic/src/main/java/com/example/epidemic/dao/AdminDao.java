package com.example.epidemic.dao;



import com.example.epidemic.dto.AdminCountDto;
import com.example.epidemic.entity.Admin;
import com.example.epidemic.excel.AdminExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/03/31/17:26
 * @Description:
 */
@Mapper
public interface AdminDao {
    /**
    新增方法
     */
    int add(Admin admin);

     /**
    查询方法
    */
    List<Admin> selectAll();

    /**
     删除方法
     */
    int del(int id);

    /**
     * 修改方法
     */
    int update(Admin admin);

    /**
     * 根据用户名模糊查询
     */
    List<Admin> selectByName(@Param("name") String name);

    /**
     * 批量删除
     */
    int delBatch(int[] ids);


    /**
     * 批量添加
     */
    int addBatch(List<AdminExcel> list);

    //查询是否存在用户
    Admin selectByOne(String name);

    List<AdminCountDto> selectTj();

    int selectTotal();
}
