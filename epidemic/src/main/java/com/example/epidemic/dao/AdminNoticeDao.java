package com.example.epidemic.dao;



import com.example.epidemic.entity.AdminNotice;
import com.example.epidemic.excel.AdminNoticeExcel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/01/16:57
 * @Description:
 */
@Mapper
public interface AdminNoticeDao {
    /**
     新增方法
     */
    int add(AdminNotice adminNotice);

    /**
     查询方法
     */
    List<AdminNotice> selectAll();

    /**
     删除方法
     */
    int del(int id);

    /**
     * 修改方法
     */
    int update(AdminNotice adminNotice);

    /**
     * 根据用户名模糊查询
     */
    List<AdminNotice> selectById(String title);

    /**
     * 批量删除
     */
    int delBatch(int[] ids);

    int addBatch(List<AdminNoticeExcel> list);
}
