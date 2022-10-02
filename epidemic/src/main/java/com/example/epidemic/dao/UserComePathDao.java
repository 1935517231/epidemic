package com.example.epidemic.dao;


import com.example.epidemic.dto.UserPathDto;
import com.example.epidemic.entity.UserComePath;
import com.example.epidemic.excel.UserComePathExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/2 16:02
 * @Version 1.0
 */
@Mapper
public interface UserComePathDao {
    /**
     * 新增
     * @param userComePath 对象
     * @return i
     */
    int add(UserComePath userComePath);

    /**
     * 查询
     * @return userComePath集合
     */
    List<UserComePath> selectAll();

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

    /**修改
     *
     * @param userComePath
     * @return i
     */
    int update(UserComePath userComePath);

    /**查询搜索条件
     *
     * @param name
     * @return
     */
    List<UserComePath> selectWhere(@Param("name") String name);

    int addBatch(List<UserComePathExcel> list);

    List<UserPathDto> selectTj();
}
