package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.VaccineStatu;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;

public interface VaccineStatuService {

    public PageBean<VaccineStatu> statuFindAll(Integer page, Integer limit, VaccineStatu vaccineStatu);

    public ResultBean update(VaccineStatu vaccineStatu);
}
