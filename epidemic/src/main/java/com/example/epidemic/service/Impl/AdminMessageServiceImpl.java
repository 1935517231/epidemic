package com.example.epidemic.service.Impl;


import com.example.epidemic.dao.AdminMessageDao;
import com.example.epidemic.dto.AdminMessageDto;
import com.example.epidemic.service.Interface.AdminMessageService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/02/15:58
 * @Description:
 */
@Service
public class AdminMessageServiceImpl implements AdminMessageService {
    @Autowired
    private AdminMessageDao adminMessageDao;

    @Override
    public PageBean selectByName(String name, int page, int limit) {
        //验证  如果name的值为""  赋值为null
        if (!StringUtils.hasLength(name)) {
            name = null;
        }else {
            name = "%" + name + "%";
        }
        //1.分页
        PageHelper.startPage(page, limit);
        //2.获取分页的结果
        PageInfo<AdminMessageDto> pageInfo = new PageInfo<>(adminMessageDao.selectByName(name));
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean delBatch(int[] ids) {
        if (ids != null && ids.length > 0) {
            if (adminMessageDao.delBatch(ids) > 0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean del(int id) {
        if (id > 0) {
            if (adminMessageDao.del(id)>0) {
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public List<AdminMessageDto> queryAll() {
        return adminMessageDao.selectAll();
    }

    @Override
    public ResultBean selectAll() {
        return ResultBean.ok(adminMessageDao.selectAll());
    }
}
