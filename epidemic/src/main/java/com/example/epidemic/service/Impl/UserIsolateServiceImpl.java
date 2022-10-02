package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.example.epidemic.dao.UserIsolateDao;
import com.example.epidemic.entity.User;
import com.example.epidemic.entity.UserIsolate;
import com.example.epidemic.service.Interface.UserIsolateService;
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
 * @Date 2022/4/1 20:28
 * @Version 1.0
 */
@Service
public class UserIsolateServiceImpl implements UserIsolateService {


    @Autowired
    private UserIsolateDao dao;
    /**
     * 批量删除
     * @param ids id数组
     * @return
     */
    @Override
    public ResultBean delBatch(int[] ids) {
        if (dao.delBatch(ids) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    /**
     * 条件查询
     * @param name 居民性名
     * @param page 页码
     * @param limit 关键字
     * @return
     */
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
        PageInfo<UserIsolate> pageInfo = new PageInfo<UserIsolate>(dao.selectWhere(name));
        //4.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    /**
     * 根据id进行删除
     * @param id isolate表的id
     * @return ok/fail
     */
    @Override
    public ResultBean del(int id) {
        if(id>0){
            if(dao.del(id)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    /**
     * 修改
     * @param userIsolate 以对象的形式
     * @return ok/fail
     */
    @Override
    public ResultBean update(UserIsolate userIsolate) {
        if(dao.update(userIsolate)>0){
            return ResultBean.ok();
        }
        return ResultBean.fail();
    }

    /**
     * 分页查询
     * @param page 分页
     * @param limit 关键字
     * @return PageBean
     */
    @Override
    public PageBean selectAll(int page, int limit) {
        //1.分页
        PageHelper.startPage(page, limit);
        //20获取分页的结果
        PageInfo<UserIsolate> pageInfo = new PageInfo<>(dao.selectAll());
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    /**
     * 添加
     * @param userIsolate 对象
     * @return ok/fail
     */
    @Override
    public ResultBean add(UserIsolate userIsolate) {
        System.out.println(userIsolate);
        if (dao.add(userIsolate) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    //查询
    @Override
    public List<UserIsolate> queryAll() {
        return dao.selectAll();
    }

    @Override
    public ResultBean saveBatch(MultipartFile file) throws Exception {
        if(!file.isEmpty()){
            //excel解析
            List<UserIsolate> list= EasyExcel.read(file.getInputStream(), UserIsolate.class, new ReadListener() {
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
            System.out.println(list);
            //执行dao 批量新增
            if(dao.addBatch(list)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }
}
