package com.example.epidemic.dao;

import com.example.epidemic.entity.VaccineUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
public interface VaccineUserDao {
    //查询份分页
    public List<VaccineUser> findAll(VaccineUser vaccineUser);

    //新增数据
    public Integer insert(VaccineUser vaccineUser);

    //删除
    int delete(Integer id);
    //修改
    int update(VaccineUser vaccineUser);

    //批量删除
    int deleteBatch(int[] ids);

    //查询通过名字和住址
    VaccineUser findByNameAndAddress(@Param("name") String name,@Param("address") String address);

    List<VaccineUser> findNot(VaccineUser vaccineUser);

    int insertNum(@Param("id") Integer id,@Param("cnum") Integer cnum);

    List<VaccineUser> findAll02();

    int addBatch(List<VaccineUser> list);

    List<VaccineUser> findYes();

    Integer ymTotal();
}
