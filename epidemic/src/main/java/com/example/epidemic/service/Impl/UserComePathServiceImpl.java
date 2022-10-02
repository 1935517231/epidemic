package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import com.example.epidemic.dao.UserComePathDao;
import com.example.epidemic.dto.UserPathDto;
import com.example.epidemic.entity.UserComePath;
import com.example.epidemic.excel.UserComePathExcel;
import com.example.epidemic.service.Interface.UserComePathService;
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
 * @Author coder gaj
 * @Date 2022/4/2 16:04
 * @Version 1.0
 */
@Service
public class UserComePathServiceImpl implements UserComePathService {
    @Autowired
    private UserComePathDao dao;

    @Override
    public ResultBean add(UserComePath userComePath) {
        if (dao.add(userComePath) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public PageBean selectAll(int page, int limit) {
        //1.分页
        PageHelper.startPage(page, limit);
        //20获取分页的结果
        PageInfo<UserComePath> pageInfo = new PageInfo<>(dao.selectAll());
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean update(UserComePath userComePath) {
        if(dao.update(userComePath)>0){
            return ResultBean.ok();
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean del(int id) {
        if(id>0){
            if(dao.del(id)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean queryPageWhere(String name, int page, int limit) {
        //1.条件处理
        if(StringUtils.hasLength(name)){
            name="%"+name+"%";
        }else{
            name=null;
        }
        //2.分页
        PageHelper.startPage(page, limit);
        //3.获取分页结果
        PageInfo<UserComePath> pageInfo=new PageInfo<>(dao.selectWhere(name));
        //4.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean delBatch(int[] ids) {
        //1.验证参数
        if(ids!=null && ids.length>0){
            //2.执行
            if(dao.delBatch(ids)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    //查询
    @Override
    public List<UserComePath> queryAll() {
        return dao.selectAll();
    }

    @Override
    public ResultBean saveBatch(MultipartFile file) throws Exception {

        if(!file.isEmpty()){
            //excel解析
            List<UserComePathExcel> list= EasyExcel.read(file.getInputStream(), UserComePathExcel.class, new ReadListener() {
                @Override
                public void onException(Exception e, AnalysisContext analysisContext) throws Exception {

                }

                @Override
                public void invokeHead(Map map, AnalysisContext analysisContext) {

                }

                @Override
                public void invoke(Object o, AnalysisContext analysisContext) {}
                @Override
                public void doAfterAllAnalysed(AnalysisContext analysisContext) {}

                @Override
                public boolean hasNext(AnalysisContext analysisContext) {
                    return false;
                }
            }).sheet().doReadSync();
            //执行dao 批量新增
            System.out.println("list " +list );

            if(dao.addBatch(list) > 0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public List<UserPathDto> selectTj() {
        return dao.selectTj();
    }
}
