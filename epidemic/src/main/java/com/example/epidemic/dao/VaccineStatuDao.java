package com.example.epidemic.dao;

import com.example.epidemic.entity.VaccineStatu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Mapper
public interface VaccineStatuDao {

    List<VaccineStatu> findAll(VaccineStatu vaccineStatu);

    int save(VaccineStatu vaccineStatu);

    int update(VaccineStatu vaccineStatu);

    int saveIntervalTime(@Param("intervalTime") Long intervalTime, @Param("id") Integer id);
}
