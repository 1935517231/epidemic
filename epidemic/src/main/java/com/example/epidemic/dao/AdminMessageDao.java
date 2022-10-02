package com.example.epidemic.dao;



import com.example.epidemic.dto.AdminMessageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/02/15:44
 * @Description:
 */
@Mapper
public interface AdminMessageDao {
    /**
     删除方法
     */
    int del(int id);

    /**
     * 根据用户名模糊查询
     */
    List<AdminMessageDto> selectByName(String name);

    /**
     * 批量删除
     */
    int delBatch(int[] ids);

    List<AdminMessageDto> selectAll();


}
