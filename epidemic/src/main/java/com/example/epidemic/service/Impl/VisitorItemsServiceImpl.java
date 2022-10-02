package com.example.epidemic.service.Impl;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import com.example.epidemic.dao.VisitorItemsDao;
import com.example.epidemic.entity.VisitorItems;
import com.example.epidemic.excel.VisitorItemsExcel;
import com.example.epidemic.service.Interface.VisitorItemsService;
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

@Service
public class VisitorItemsServiceImpl implements VisitorItemsService {
    @Autowired
    private VisitorItemsDao itemsDao;

    @Override
    public ResultBean add(VisitorItems visitorItems) {
        if (itemsDao.add(visitorItems) > 0) {
            return ResultBean.ok();
        } else {
            return ResultBean.fail();
        }
    }

    @Override
    public List<VisitorItems> selectAll() {
        return itemsDao.selectAll();
    }

    @Override
    public ResultBean del(int id) {
        if (id > 0) {
            if (itemsDao.del(id) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean update(VisitorItems visitorItems) {
        if (itemsDao.update(visitorItems) > 0) {
            return ResultBean.ok();
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean queryPageWhere(String name, int page, int limit) {
        if (!StringUtils.hasLength(name)) {
            name = null;
        } else {
            name = "%" + name + "%";
        }
        //2.分页
        PageHelper.startPage(page, limit);
        //3.获取分页结果
        PageInfo<VisitorItems> pageInfo = new PageInfo<>(itemsDao.selectWhere(name));
        //4.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean delBatch(int[] ids) {
        if (ids != null && ids.length > 0) {
            //2.执行
            if (itemsDao.delBatch(ids) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }
    @Override
    public ResultBean addBatch(MultipartFile file) throws Exception {
        if (!file.isEmpty()) {
            List<VisitorItemsExcel> list = EasyExcel.read(file.getInputStream(), VisitorItemsExcel.class, new ReadListener() {
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
            if (itemsDao.addBatch(list) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }
}
