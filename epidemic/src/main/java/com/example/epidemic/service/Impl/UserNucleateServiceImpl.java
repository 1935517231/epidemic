package com.example.epidemic.service.Impl;

import com.example.epidemic.dao.UserDao;
import com.example.epidemic.dao.UserNucleateDao;
import com.example.epidemic.dto.UserNucleateDto;
import com.example.epidemic.entity.User;
import com.example.epidemic.entity.UserNucleate;
import com.example.epidemic.excel.UserNucleateExcel;
import com.example.epidemic.service.Interface.UserNucleateService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.xml.ws.EndpointReference;
import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/5 15:12
 * @Version 1.0
 */
@Service
public class UserNucleateServiceImpl implements UserNucleateService {
    @Autowired
    private UserNucleateDao dao;

    @Autowired
    private UserDao userDao;
    @Override
    public ResultBean add(UserNucleateDto userNucleateDto) {
        int uId = 0;
        UserNucleate nucleate = new UserNucleate();
        if (userNucleateDto != null ) {
            System.out.println(userNucleateDto);
            for (User user : userDao.selectAll()) {
                if (userNucleateDto.getName().equals(user.getName())) {
                    uId = user.getId();
                    nucleate.setUId(uId);
                    nucleate.setCollectTime(userNucleateDto.getCollectTime());
                    nucleate.setTestTime(userNucleateDto.getTestTime());
                    nucleate.setResult(userNucleateDto.getResult());
                    System.out.println(nucleate);
                }
            }
            if (dao.add(nucleate) > 0) {
                return ResultBean.ok();
            } else {
                return ResultBean.fail("新增失败");
            }
        }
        return ResultBean.fail("不能为空");
    }

    @Override
    public ResultBean del(int id) {
        if (dao.del(id) > 0) {
            return ResultBean.ok();
        } else {
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
        PageInfo<UserNucleateDto> pageInfo=new PageInfo<>(dao.selectWhere(name));
        //4.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public ResultBean delBatch(int[] ids) {
        if (dao.delBatch(ids) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    @Override
    public List<UserNucleateExcel> queryAll() {
        return dao.selectAll();
    }
}
