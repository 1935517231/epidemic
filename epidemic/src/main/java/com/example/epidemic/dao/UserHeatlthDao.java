package com.example.epidemic.dao;


import com.example.epidemic.dto.OwnHealthDto;
import com.example.epidemic.dto.UserHeatlthAdmin;
import com.example.epidemic.entity.OwnHealth;
import com.example.epidemic.entity.User;
import com.example.epidemic.entity.UserHeatlth;
import com.example.epidemic.excel.UserHeathAdminExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/1 14:54
 * @Version 1.0
 */
@Mapper
public interface UserHeatlthDao {

    int add(UserHeatlth userHeatlth);

    List<UserHeatlthAdmin> selectAll();

    int del(int id);

    int delBatch(int[] ids);

    int update(UserHeatlth userHeatlth);

    List<User> selectWhere(@Param("name") String name);

    int addBatch(List<UserHeathAdminExcel> list);
    int addOwnHealth(OwnHealth ownHealth);

    List<OwnHealthDto> selectWhereByOne(@Param("name") String name);
}
