package com.example.epidemic.dao;



import com.example.epidemic.entity.UserIsolate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/1 20:27
 * @Version 1.0
 */
@Mapper
public interface UserIsolateDao {
    /**
     * 新增
     * @param userIsolate 对象
     * @return i
     */
    int add(UserIsolate userIsolate);

    /**
     * 查询
     * @return isolate集合
     */
    List<UserIsolate> selectAll();

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
     * @param userIsolate
     * @return
     */
    int update(UserIsolate userIsolate);

    /**查询搜索条件
     *
     * @param name
     * @return
     */
    List<UserIsolate> selectWhere(String name);

    int addBatch(List<UserIsolate> list);
}
