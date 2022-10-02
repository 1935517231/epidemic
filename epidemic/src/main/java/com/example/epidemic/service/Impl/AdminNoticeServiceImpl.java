package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import com.example.epidemic.dao.AdminNoticeDao;
import com.example.epidemic.entity.AdminNotice;
import com.example.epidemic.excel.AdminNoticeExcel;
import com.example.epidemic.service.Interface.AdminNoticeService;
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
 * @Date: 2022/04/01/17:08
 * @Description:
 */
@Service
public class AdminNoticeServiceImpl implements AdminNoticeService {
    //注入
    @Autowired
    private AdminNoticeDao adminDao;

    @Override
    public ResultBean add(AdminNotice admin) {
        if (adminDao.add(admin) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public ResultBean selectAll() {
        return ResultBean.ok(adminDao.selectAll());
    }


    @Override
    public ResultBean del(int id) {
        if (id > 0) {
            if (adminDao.del(id)>0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean update(AdminNotice admin) {
        if (admin != null) {
            if (adminDao.update(admin) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean selectByName(String title, int page, int limit) {
        if (!StringUtils.hasLength(title)) {
            title = null;
        }else {
            title = "%" + title + "%";
        }

        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<AdminNotice> pageInfo = new PageInfo<>(adminDao.selectById(title));
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());

    }

    @Override
    public ResultBean delBatch(int[] ids) {
        if (ids != null && ids.length > 0) {
            if (adminDao.delBatch(ids) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean addBatch(MultipartFile file) throws Exception{
        if (!file.isEmpty()) {
            List<AdminNoticeExcel> list = EasyExcel.read(file.getInputStream(), AdminNoticeExcel.class, new ReadListener() {
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
            //System.out.println(list);
            if (adminDao.addBatch(list) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public List<AdminNotice> queryAll() {
        return adminDao.selectAll();
    }
}
