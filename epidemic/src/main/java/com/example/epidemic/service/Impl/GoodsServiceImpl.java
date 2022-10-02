package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import com.example.epidemic.dao.GoodsDao;
import com.example.epidemic.entity.Goods;
import com.example.epidemic.excel.GoodsExcel;
import com.example.epidemic.service.Interface.GoodsService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao dao;


    @Override
    public PageBean selectAll(int page, int limit) {
        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<Goods> pageInfo = new PageInfo<>(dao.selectAll());
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    //      新增一条物资信息
    @Override
    public ResultBean add(Goods goods) {
        /*判断这个物资是否已经存在，如果不存在则可以添加，如果存在则不能添加*/
        if(dao.selectWhere(goods.getG_name(), goods.getG_tid())!=null&&dao.selectWhere(goods.getG_name(), goods.getG_tid()).size()!=0){
            return ResultBean.fail("物资信息已存在,请勿重复添加");
        }else{
            if (dao.add(goods) > 0) {
                return ResultBean.ok();
            }else {
                return ResultBean.fail();
            }
        }

    }

//    修改某一条物资信息
    @Override
    public ResultBean update(Goods goods) {
        if (dao.update(goods) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    // 删除某一条物资信息
    @Override
    public ResultBean delete(int g_id) {
        if (dao.delete(g_id) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }
//      模糊查询
    @Override
    public PageBean selectWhere(String g_name, int g_tid, int page, int limit) {
        //条件处理
        if(StringUtils.hasLength(g_name)){
            g_name="%"+g_name+"%";
        }else{
            g_name=null;
        }
        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<Goods> pageInfo = new PageInfo<>(dao.selectWhere(g_name,g_tid));
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean deleteBatch(int[] ids) {
        //1.验证参数
        if(ids!=null && ids.length>0){
            //2.执行
            if(dao.deleteBatch(ids)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();

    }

//    查询库存
    @Override
    public PageBean selectCount(String name,int count, int page, int limit) {
        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<Goods> pageInfo = new PageInfo<>(dao.selectCount(name,count));
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean updateCount(String name, int count) {
        if (dao.updateCount(name, count) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public ResultBean addByPurchase(String name, int count, String unit, int tid) {
        if (dao.addByPurchase(name,count, unit,tid) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public ResultBean updateCountByPurchase(String name, int count) {
        if (dao.updateCountByPurchase(name, count) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public ResultBean addBatch(MultipartFile file) throws Exception {
        if(!file.isEmpty()){
            //excel解析
            List<GoodsExcel> list= EasyExcel.read(file.getInputStream(), GoodsExcel.class, new ReadListener() {
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
            //执行dao 批量新增
            List<GoodsExcel> goodsExcels = new ArrayList<>();
            for (GoodsExcel goodsExcel : list) {

                goodsExcels.add(goodsExcel);
            }
            if(dao.addBatch(goodsExcels)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }
}
