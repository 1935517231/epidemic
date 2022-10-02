package com.example.epidemic.service.Impl;

import com.example.epidemic.dao.VaccineStatuDao;
import com.example.epidemic.entity.VaccineStatu;
import com.example.epidemic.service.Interface.VaccineStatuService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class VaccineStatuServiceImpl implements VaccineStatuService {
    @Autowired
    private VaccineStatuDao vaccineStatuDao;

    //查询所有接种后人员的状态
    @Override
    public PageBean<VaccineStatu> statuFindAll(Integer page, Integer limit, VaccineStatu vaccineStatu){
        List<VaccineStatu> all = vaccineStatuDao.findAll(vaccineStatu);
        ArrayList<VaccineStatu> vaccineStatus = new ArrayList<>();
        if (all.size()>0 &&all !=null){
            for (VaccineStatu v :all){
                Date vatime = v.getVatime();
                long start = vatime.getTime();
                Date date =new Date();
                long end = date.getTime();
                long num =end-start;
                 long day =num/24/60/60/1000;
                 v.setIntervalTime(day);
                 vaccineStatus.add(v);
            }
            PageHelper.startPage(page,limit);
            PageInfo<VaccineStatu> vaccineStatuPageInfo = new PageInfo<>(vaccineStatus);
            return PageBean.bean(vaccineStatuPageInfo.getTotal(), vaccineStatuPageInfo.getList());


        }
        return PageBean.bean(0,null);
    }

    @Override
    public ResultBean update(VaccineStatu vaccineStatu) {
        int update = vaccineStatuDao.update(vaccineStatu);
        if (update>0){
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }


}
