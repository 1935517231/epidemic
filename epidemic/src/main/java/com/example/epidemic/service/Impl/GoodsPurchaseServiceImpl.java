package com.example.epidemic.service.Impl;


import com.example.epidemic.dao.GoodsDao;
import com.example.epidemic.dao.GoodsPurchaseDao;
import com.example.epidemic.entity.GoodsPurchase;
import com.example.epidemic.service.Interface.GoodsPurchaseService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Service
public class GoodsPurchaseServiceImpl implements GoodsPurchaseService {
    @Autowired
    private GoodsPurchaseDao dao;

    @Autowired
    private GoodsDao goodsDao;

//  搜索   查询
    @Override
    public PageBean selectWhere(String gp_admin, String gp_gname, int page, int limit) {
        //条件处理
        if(StringUtils.hasLength(gp_admin)){
            gp_admin="%"+gp_admin+"%";
        }else{
            gp_admin=null;
        }
        if(StringUtils.hasLength(gp_gname)){
            gp_gname="%"+gp_gname+"%";
        }else{
            gp_gname=null;
        }
        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<GoodsPurchase> pageInfo = new PageInfo<>(dao.selectWhere(gp_admin,gp_gname));
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

//    新增
    @Override
    public ResultBean add(GoodsPurchase goodsPurchase) {
//        判断此物资在物资表中是否已经存在
        if (goodsDao.selectWhere(goodsPurchase.getGp_gname(), 1).size()==0&&goodsDao.selectWhere(goodsPurchase.getGp_gname(), 2).size()==0){
//            不存在，添加新的物资信息
            System.err.println(goodsPurchase);
            goodsDao.addByPurchase(goodsPurchase.getGp_gname(),goodsPurchase.getGp_count(),goodsPurchase.getGp_unit(),goodsPurchase.getGp_tid());
        }else{
//            已经存在，更改库存数量
            goodsDao.updateCountByPurchase(goodsPurchase.getGp_gname(),goodsPurchase.getGp_count());
        }
        if (dao.add(goodsPurchase) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
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
    public ResultBean delete(int gp_id) {
        if (dao.delete(gp_id) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public ResultBean update(GoodsPurchase goodsPurchase) {
        if (dao.update(goodsPurchase) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }
}
