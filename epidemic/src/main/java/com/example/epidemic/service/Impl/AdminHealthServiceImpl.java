package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import com.example.epidemic.dao.AdminHealthDao;
import com.example.epidemic.dto.AdminHealthDto;
import com.example.epidemic.entity.AdminHealth;
import com.example.epidemic.excel.AdminHealthExcel;
import com.example.epidemic.service.Interface.AdminHealthService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: gpt
 * @Date: 2022/04/01/20:44
 * @Description:
 */
@Service
public class AdminHealthServiceImpl implements AdminHealthService {
    //注入
    @Autowired
    private AdminHealthDao adminHealthDao;

    @Override
    public ResultBean add(AdminHealth adminHealth) {
        if (adminHealthDao.add(adminHealth) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public PageBean selectAll(int page, int limit) {
        //验证  如果name的值为""  赋值为null

        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<AdminHealthDto> pageInfo = new PageInfo<>(adminHealthDao.selectAll());
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public List<AdminHealthDto> queryAll() {
        return adminHealthDao.selectAll();
    }



    @Override
    public ResultBean del(int id) {
        if (id > 0) {
            if (adminHealthDao.del(id)>0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean update(AdminHealth admin) {
        if (admin != null) {
            if (adminHealthDao.update(admin) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean selectByName(String name, int page, int limit) {
        //验证  如果name的值为""  赋值为null
        if (!StringUtils.hasLength(name)) {
            name = null;
        }else {
            name = "%" + name + "%";
        }
        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<AdminHealthDto> pageInfo = new PageInfo<>(adminHealthDao.selectByName(name));
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());

    }

    @Override
    public ResultBean delBatch(int[] ids) {
        if (ids != null && ids.length > 0) {
            if (adminHealthDao.delBatch(ids) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean addBatch(MultipartFile file) throws Exception{
        if (!file.isEmpty()) {
            List<AdminHealthExcel> list = EasyExcel.read(file.getInputStream(), AdminHealthExcel.class, new ReadListener() {
                @Override
                public void onException(Exception e, AnalysisContext analysisContext) throws Exception {

                }

                @Override
                public void invokeHead(Map map, AnalysisContext analysisContext) {

                }

                @Override
                public void invoke(Object o, AnalysisContext analysisContext) {

                }

                @Override
                public void doAfterAllAnalysed(AnalysisContext analysisContext) {

                }

                @Override
                public boolean hasNext(AnalysisContext analysisContext) {
                    return false;
                }
            }).sheet().doReadSync();
            System.out.println(list);
            if (adminHealthDao.addBatch(list) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }
}
