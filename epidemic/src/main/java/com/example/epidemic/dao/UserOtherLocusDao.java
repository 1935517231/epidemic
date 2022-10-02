package com.example.epidemic.dao;


import com.example.epidemic.entity.UserOtherLocus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/2 14:26
 * @Version 1.0
 */
@Mapper
public interface UserOtherLocusDao {
    /**
     * 新增
     * @param userOtherLocus 对象
     * @return i
     */
    int add(UserOtherLocus userOtherLocus);

    /**
     * 查询
     * @return OtherLocus集合
     */
    List<UserOtherLocus> selectAll();

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
     * @param userOtherLocus
     * @return i
     */
    int update(UserOtherLocus userOtherLocus);

    /**查询搜索条件
     *
     * @param name
     * @return
     */
    List<UserOtherLocus> selectWhere(@Param("name") String name);

    int addBatch(List<UserOtherLocus> list);
}
