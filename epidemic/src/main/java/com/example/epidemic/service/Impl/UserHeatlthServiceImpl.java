package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import com.example.epidemic.dao.AdminDao;
import com.example.epidemic.dao.UserDao;
import com.example.epidemic.dao.UserHeatlthDao;
import com.example.epidemic.dto.OwnHealthDto;
import com.example.epidemic.dto.UserHeatlthAdmin;
import com.example.epidemic.entity.Admin;
import com.example.epidemic.entity.OwnHealth;
import com.example.epidemic.entity.User;
import com.example.epidemic.entity.UserHeatlth;
import com.example.epidemic.excel.UserHeathAdminExcel;
import com.example.epidemic.excel.UserHeathExcel;
import com.example.epidemic.service.Interface.UserHeatlthService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author coder gaj
 * @Date 2022/4/1 16:21
 * @Version 1.0
 */
@Service
public class UserHeatlthServiceImpl implements UserHeatlthService {
    @Autowired
    private UserHeatlthDao dao;

    @Autowired
    private UserDao userDao;

    @Resource
    private AdminDao adminDao;
    @Override
    public ResultBean add(UserHeatlthAdmin userHeatlthAdmin) {
        int uId = 0;
        int aId = 0;
        UserHeatlth userHeatlth = new UserHeatlth();
        if (userHeatlthAdmin!=null) {
            for (User user : userDao.selectAll()) {
                if (user.getName().equals(userHeatlthAdmin.getName())){
                    uId = user.getId();
                }
            }
            for (Admin admin : adminDao.selectAll()) {
                if (admin.getName().equals(userHeatlthAdmin.getAdminName())){
                    aId = admin.getId();
                }
            }

             userHeatlth = new UserHeatlth(uId, userHeatlthAdmin.getPlCondition(), userHeatlthAdmin.getSelTemp(),
                    userHeatlthAdmin.getSelTempTime(), userHeatlthAdmin.getByTempTime(), userHeatlthAdmin.getByTemp(),
                    aId, userHeatlthAdmin.getFlag());

        } else {
            return ResultBean.fail();
        }
        if (dao.add(userHeatlth) > 0) {
            return  ResultBean.ok();
        }else {
            return ResultBean.fail();
        }

    }

    @Override
    public PageBean selectAll(int page, int limit) {
        //1.分页
        PageHelper.startPage(page, limit);
        //20获取分页的结果
        PageInfo<UserHeatlthAdmin> pageInfo = new PageInfo<>(dao.selectAll());
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean del(int id) {
        if (dao.del(id) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public ResultBean delBatch(int[] ids) {
        if (dao.delBatch(ids) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    /**
     * 修改
     * @param userHeatlthAdmin 对象
     * @return ok/fail
     */
    @Override
    public ResultBean update(UserHeatlthAdmin userHeatlthAdmin) {
        int uId = 0;
        int aId = 0;
        UserHeatlth userHeatlth = new UserHeatlth();
        System.out.println(userHeatlthAdmin);
        if (userHeatlthAdmin!=null) {
            for (User user : userDao.selectAll()) {
                if (user.getName().equals(userHeatlthAdmin.getName())){
                    uId = user.getId();
                }
            }
            for (Admin admin : adminDao.selectAll()) {
                if (admin.getName().equals(userHeatlthAdmin.getAdminName())){
                    aId = admin.getId();
                }
            }

            userHeatlth = new UserHeatlth(userHeatlthAdmin.getId(),uId, userHeatlthAdmin.getPlCondition(), userHeatlthAdmin.getSelTemp(),
                    userHeatlthAdmin.getSelTempTime(), userHeatlthAdmin.getByTempTime(), userHeatlthAdmin.getByTemp(),
                    aId, userHeatlthAdmin.getFlag());
            System.out.println("userHeatlth" + userHeatlth);

        } else {
            return ResultBean.fail();
        }
        if (dao.update(userHeatlth) > 0) {
            return  ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
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
        PageInfo<User> pageInfo=new PageInfo<>(dao.selectWhere(name));
        //4.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    //查询
    @Override
    public List<UserHeatlthAdmin> queryAll() {
        return dao.selectAll();
    }

    @Override
    public ResultBean saveBatch(MultipartFile file) throws Exception {
        List<UserHeathAdminExcel> userHeathAdminExcels = new ArrayList<>();
        int uId = 0;
        int aId = 0;
        UserHeathAdminExcel userHeathAdminExcel = new UserHeathAdminExcel();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date byTime = new Date();
        Date selTime = new Date();

        if(!file.isEmpty()){
            //excel解析
            List<UserHeathExcel> list= EasyExcel.read(file.getInputStream(), UserHeathExcel.class, new ReadListener() {
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
            for (UserHeathExcel userHeathExcel : list) {
                for (User user : userDao.selectAll()) {
                    if (user.getName().equals(userHeathExcel.getName())){
                        uId = user.getId();
                    }
                }
                for (Admin admin : adminDao.selectAll()) {
                    if (admin.getName().equals(userHeathExcel.getAdminName())){
                        aId = admin.getId();
                    }
                }
                userHeathAdminExcel= new UserHeathAdminExcel(uId, userHeathExcel.getPlCondition(), userHeathExcel.getSelTemp(),
                        userHeathExcel.getSelTempTime(),userHeathExcel.getByTempTime(), userHeathExcel.getByTemp(),
                        aId, userHeathExcel.getFlag());
                userHeathAdminExcels.add(userHeathAdminExcel);

            }
            //执行dao 批量新增
            for (UserHeathAdminExcel heathAdminExcel : userHeathAdminExcels) {
                System.out.println(heathAdminExcel);
            }
            if(dao.addBatch(userHeathAdminExcels)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean addOwnHealth(OwnHealth ownHealth) {

        if (dao.addOwnHealth(ownHealth) > 0) {
            return ResultBean.ok();
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean queryPageByOne(String name, int page, int limit) {
        //1.条件处理
        if(StringUtils.hasLength(name)){
            name="%"+name+"%";
        }else{
            name=null;
        }
        //2.分页
        PageHelper.startPage(page, limit);
        //3.获取分页结果
        PageInfo<OwnHealthDto> pageInfo=new PageInfo<>(dao.selectWhereByOne(name));
        //4.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }
}
