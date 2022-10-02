package com.example.epidemic.dao;


import com.example.epidemic.entity.VaccineNum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface VaccineNumDao {

    int saveUserId(@Param("userId") Integer userId);

    List<VaccineNum> select();

    int update(@Param("id") Integer id);


}
