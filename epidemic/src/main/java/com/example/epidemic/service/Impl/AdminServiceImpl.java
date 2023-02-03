package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import com.example.epidemic.dao.AdminDao;
import com.example.epidemic.dto.AdminCountDto;
import com.example.epidemic.entity.Admin;
import com.example.epidemic.excel.AdminExcel;
import com.example.epidemic.service.Interface.AdminService;
import com.example.epidemic.utils.PassUtils;
import com.example.epidemic.utils.StringUtils;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: gpt
 * @Date: 2022/03/31/17:46
 * @Description:
 */
@Service
@Slf4j
public class AdminServiceImpl implements AdminService {
    private static String key = "V1oI3GzV3xkqhQsBmaYapw==";
    //注入
    @Autowired
    private AdminDao adminDao;

    @Override
    public ResultBean add(Admin admin) {
        log.info(admin.toString());
        String key = "V1oI3GzV3xkqhQsBmaYapw==";
        String pass = PassUtils.aesenc(key, admin.getPassword());
        //log.info(String.valueOf(adminDao.selectByName(admin.getName()).size()));
        if (adminDao.selectByName(admin.getName()).size() == 0){
            admin.setPassword(pass);
            admin.setCtime(new Date());
            admin.setFlag(1);
            if (adminDao.add(admin) > 0) {
                return ResultBean.ok();
            }
        }
        String msg = "该用户已存在";
        return ResultBean.fail(msg);

    }

    @Override
    public List<Admin> selectAll() {
        log.info(adminDao.selectAll().toString());
        return adminDao.selectAll();
    }

    @Override
    public ResultBean del(int id) {
        if (id > 0) {
            if (adminDao.del(id)>0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean update(Admin admin) {

        admin.setCtime(new Date());
        System.out.println(admin.getCtime());
        if (admin != null) {
            if (adminDao.update(admin) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean selectByName(String name, int page, int limit) {
        //验证  如果name的值为""  赋值为null
        if (!StringUtils.isNotEmpty(name)) {
            name = null;
        }else {
            name = "%" + name + "%";
        }
        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<Admin> pageInfo = new PageInfo<>(adminDao.selectByName(name));
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());

    }

    @Override
    public ResultBean delBatch(int[] ids) {
        if (ids != null && ids.length > 0) {
            if (adminDao.delBatch(ids) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean addBatch(MultipartFile file) throws Exception {

        if (!file.isEmpty()) {
            List<AdminExcel> list = EasyExcel.read(file.getInputStream(), AdminExcel.class, new ReadListener() {
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

            List<AdminExcel> adminExcels = new ArrayList<>();

            for (AdminExcel adminExcel : list) {
                String pass = PassUtils.aesenc(key, adminExcel.getPassword());
                adminExcel.setPassword(pass);

                adminExcels.add(adminExcel);
            }
            if (adminDao.addBatch(list) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean login(Admin admin, HttpSession session) {
        if (admin != null && StringUtils.isNotEmpty(admin.getName(), admin.getPassword())) {
            Admin admin1 = adminDao.selectByOne(admin.getName());
            if (admin1 != null) {
                if (admin1.getPassword().equals(PassUtils.aesenc(key,admin.getPassword()))) {
                    session.setAttribute("admin", admin);
                    return ResultBean.ok(admin);
                }
            }
        }
        return ResultBean.fail();
    }

    @Override
    public List<AdminCountDto> selectTj() {
        return adminDao.selectTj();
    }

    @Override
    public int selectTotal() {
        return adminDao.selectTotal();
    }
}
