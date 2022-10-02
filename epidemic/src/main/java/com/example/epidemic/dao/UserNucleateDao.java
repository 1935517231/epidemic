package com.example.epidemic.dao;


import com.example.epidemic.dto.UserNucleateDto;
import com.example.epidemic.entity.UserNucleate;
import com.example.epidemic.excel.UserNucleateExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/5 15:12
 * @Version 1.0
 */
@Mapper
public interface UserNucleateDao {

    /**
     * 新增
     * @param userNucleate 对象
     * @return i
     */
    int add(UserNucleate userNucleate);

    /**
     * 查询
     * @return user集合
     */
    List<UserNucleateExcel> selectAll();

    /**
     * 删除
     * @param id 根据id
     * @return i
     */
    int del(int id);

    /**
     * 批量删除
     * @param ids id数组
     * @return i
     */
    int delBatch(int[] ids);

    List<UserNucleateDto> selectWhere(@Param("name") String name);

}
