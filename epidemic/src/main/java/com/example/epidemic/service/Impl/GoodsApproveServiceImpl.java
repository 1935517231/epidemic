package com.example.epidemic.service.Impl;


import com.example.epidemic.dao.GoodsApproveDao;
import com.example.epidemic.dao.GoodsDao;
import com.example.epidemic.dao.UserDao;
import com.example.epidemic.entity.GoodsApprove;
import com.example.epidemic.service.Interface.GoodsApproveService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service
public class GoodsApproveServiceImpl implements GoodsApproveService {
    @Autowired
    private GoodsApproveDao dao;

    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private UserDao userDao;


    //  搜索   查询
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
        PageInfo<GoodsApprove> pageInfo = new PageInfo<>(dao.selectWhere(username,goodsname));
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

//    添加物资新申请记录
    @Override
    public ResultBean add(GoodsApprove goodsApprove) {
/*
* 判断申请的物资在物资表中是否存在，如果存在则对物资表中的物资数量进行修改，不存在则提示物资不存在*/
        if (goodsDao.selectWhere(goodsApprove.getGoodsname(), 2).size()!=0||goodsDao.selectWhere(goodsApprove.getGoodsname(), 1).size()!=0){
//            物资存在，再判断用户是否存在
            if (userDao.selectWhere(goodsApprove.getUsername(),1).size()!=0||userDao.selectWhere(goodsApprove.getUsername(),2).size()!=0){
//                用户存在，判断库存是否充足
                if (goodsDao.selectCount(goodsApprove.getGoodsname(),goodsApprove.getCount()).size()!=0){
//                    修改物资库存
                    goodsDao.updateCount(goodsApprove.getGoodsname(), goodsApprove.getCount());
                    if (dao.add(goodsApprove) > 0) {
                        return ResultBean.ok();
                    }else {
                        return ResultBean.fail();
                    }
                }else{
                    return ResultBean.fail("库存不足，无法申请");
                }


            }else{
                return ResultBean.fail("用户信息不存在，请添加用户信息");
            }

        }else{
//            物资不存在
           return ResultBean.fail("物资信息不存在，无法申请");
        }


    }

    //      批量删除
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
    public ResultBean update(GoodsApprove goodsApprove) {
        if (dao.update(goodsApprove) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }
}
