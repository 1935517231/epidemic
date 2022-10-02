package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import com.example.epidemic.dao.VisitorMessageDao;
import com.example.epidemic.entity.VisitorMessage;
import com.example.epidemic.excel.VisitorMessageExcel;
import com.example.epidemic.service.Interface.VisitorMessageService;
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
public class VisitorMessageServiceImpl implements VisitorMessageService {
    @Autowired
    private VisitorMessageDao messageDao;

    @Override
    public ResultBean add(VisitorMessage visitorMessage) {
        if (messageDao.add(visitorMessage) > 0) {
            return ResultBean.ok();
        } else {
            return ResultBean.fail();
        }
    }
    @Override
    public List<VisitorMessage> selectAll() {
        return messageDao.selectAll();
    }

    @Override
    public ResultBean del(int id) {
        if(id>0){
            if(messageDao.delMessage(id)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean queryPageWhere(String name, int page, int limit) {
        if(!StringUtils.hasLength(name)){
            name = null;
        }else{
            name = "%" + name + "%";
        }
        PageHelper.startPage(page,limit);
        PageInfo<VisitorMessage> pageInfo = new PageInfo<>(messageDao.selectWhere(name));
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean delBatch(int[] ids) {
        if(ids != null && ids.length > 0 ){
            if(messageDao.delBatch(ids) > 0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }
    @Override
    public ResultBean addBatch(MultipartFile file) throws Exception {
        if (!file.isEmpty()) {
            List<VisitorMessageExcel> list = EasyExcel.read(file.getInputStream(), VisitorMessageExcel.class, new ReadListener() {
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
            if (messageDao.addBatch(list) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }
}
