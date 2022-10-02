package com.example.epidemic.service.Impl;


import com.example.epidemic.dao.GoodsLogDao;
import com.example.epidemic.entity.GoodsLog;
import com.example.epidemic.service.Interface.GoodsLogService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service
public class GoodsLogServiceImpl implements GoodsLogService {
    @Autowired
    private GoodsLogDao dao;

    @Override
    public PageBean selectWhere(String username, String goodsname, int page, int limit) {
        //条件处理
        if(StringUtils.hasLength(username)){
            username="%"+username+"%";
        }else{
            username=null;
        }
        if(StringUtils.hasLength(goodsname)){
            goodsname="%"+goodsname+"%";
        }else{
            goodsname=null;
        }
        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<GoodsLog> pageInfo = new PageInfo<>(dao.selectWhere(username,goodsname));
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean deleteBatch(int[] ids) {
        for (int i = 0; i < ids.length; i++) {
            System.err.println(ids[i]);
        }
        //1.验证参数
        if(ids!=null && ids.length>0){
            //2.执行
            if(dao.deleteBatch(ids)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean delete(int id) {
        if (dao.delete(id) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public ResultBean add(GoodsLog goodsLog) {
        if (dao.add(goodsLog) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }
}
