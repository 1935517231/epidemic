package com.example.epidemic.service.Impl;

import com.example.epidemic.dao.VaccineNumDao;
import com.example.epidemic.entity.VaccineNum;
import com.example.epidemic.service.Interface.VaccineNumService;
import com.example.epidemic.vo.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class VaccineNumServiceImpl implements VaccineNumService {
    @Autowired
    VaccineNumDao vaccineNumDao;

    @Override
    public PageBean<VaccineNum> selectAll(Integer page, Integer limit) {
       List<VaccineNum> vaccineNums= new ArrayList<>();
        List<VaccineNum> select = vaccineNumDao.select();
         for (VaccineNum v:select){
             Date vatime = v.getCtime();
             long start = vatime.getTime();
             Date date =new Date();
             long end = date.getTime();
             long num =end-start;
             long day =num/24/60/60/1000;
             if (day<60){
                 v.setIsOk('0');
             }else {
                 v.setIsOk('1');
             }
             v.setDay(day);

             vaccineNums.add(v);
         }
        PageHelper.startPage(page, limit);
        PageInfo<VaccineNum> vaccineNumPageInfo = new PageInfo<>(vaccineNums);
   return  PageBean.bean(vaccineNumPageInfo.getTotal(),vaccineNumPageInfo.getList());
    }

    @Override
    public int update(Integer id) {
        vaccineNumDao.update(id);
        return 0;
    }
}
