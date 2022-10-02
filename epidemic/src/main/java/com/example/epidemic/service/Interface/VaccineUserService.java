package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.VaccineUser;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface VaccineUserService {

    //查询分页
    public PageBean<VaccineUser> finAll(Integer pageNum, Integer pageSize, VaccineUser vaccineUser);

    //新增数据
    public ResultBean save(VaccineUser vaccineUser);

    //删除Byid
    ResultBean delete(Integer id);

    //删除批量
      ResultBean deleteBatch(int[] ids);

      //动态修改
    ResultBean update(VaccineUser vaccineUser);

    //
    PageBean<VaccineUser> findNot(Integer pageNum,Integer pageSize,VaccineUser vaccineUser);


    List<VaccineUser> findAll();

    ResultBean addBatch(MultipartFile file) throws IOException;

    List<VaccineUser> findYes();

    Integer ymTotal();
}
