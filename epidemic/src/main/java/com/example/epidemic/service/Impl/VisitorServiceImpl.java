package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import com.example.epidemic.dao.VisitorDao;
import com.example.epidemic.dto.UserCountDto;
import com.example.epidemic.entity.Visitor;
import com.example.epidemic.excel.VisitorExcel;
import com.example.epidemic.service.Interface.VisitorService;
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
public class VisitorServiceImpl implements VisitorService {
    @Autowired
    private VisitorDao visitorDao;

    @Override
    public ResultBean add(Visitor visitor) {
        if (visitorDao.add(visitor) > 0) {
            return ResultBean.ok();
        } else {
            return ResultBean.fail();
        }
    }

    @Override
    public List<Visitor> selectAll() {
        return visitorDao.selectAll();
    }

    @Override
    public ResultBean del(int id) {
        if (id > 0) {
            if (visitorDao.del(id) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean update(Visitor visitor) {
        if (visitorDao.update(visitor) > 0) {
            return ResultBean.ok();
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean queryPageWhere(String name, int page, int limit) {
        //1.条件处理
        if (!StringUtils.hasLength(name)) {
            name = null;
        } else {
            name = "%" + name + "%";
        }
        //2.分页
        PageHelper.startPage(page, limit);
        //3.获取分页结果
        PageInfo<Visitor> pageInfo = new PageInfo<>(visitorDao.selectWhere(name));
        //4.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean delBatch(int[] ids) {
        //1.验证参数
        if (ids != null && ids.length > 0) {
            //2.执行
            if (visitorDao.delBatch(ids) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean addBatch(MultipartFile file) throws Exception {
        if (!file.isEmpty()) {
            List<VisitorExcel> list = EasyExcel.read(file.getInputStream(), VisitorExcel.class, new ReadListener() {
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
            if (visitorDao.addBatch(list) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }
    @Override
    public int selectTotal() {
        return visitorDao.selectTotal();
    }

    @Override
    public List<UserCountDto> selectTj() {
        return visitorDao.selectTj();
    }
}