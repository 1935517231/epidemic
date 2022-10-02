package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.VaccineNum;
import com.example.epidemic.vo.PageBean;
import org.springframework.stereotype.Service;


public interface VaccineNumService {

    public PageBean<VaccineNum> selectAll(Integer page, Integer limit);

    int update(Integer id);
}
