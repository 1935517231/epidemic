package com.example.epidemic.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.example.epidemic.dao.UserDao;
import com.example.epidemic.dto.UserCountDto;
import com.example.epidemic.entity.AdminMessage;
import com.example.epidemic.entity.AdminNotice;
import com.example.epidemic.entity.User;
import com.example.epidemic.excel.UserExcel;
import com.example.epidemic.service.Interface.UserService;
import com.example.epidemic.utils.PassUtils;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lee
 * @date 2022/9/18  10:34
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    public ResultBean login(User user , HttpSession session) {
        if (user != null && com.example.epidemic.utils.StringUtils.isNotEmpty(user.getName(), user.getIdCard(), user.getPassword())) {
            User user1 = dao.login(user.getName(),user.getIdCard());
            String key = "V1oI3GzV3xkqhQsBmaYapw==";
            if (user1 != null) {
                String pass = PassUtils.aesdec(key, user1.getPassword());
                if (user.getPassword().equals(pass)) {
                    session.setAttribute("user", user1);
                    return ResultBean.ok(user);
                } else {
                    return ResultBean.fail("账号或密码错误");
                }
            } else {
                return ResultBean.fail("用户不存在");
            }

        }
        return ResultBean.fail("请输入用户");
    }
    /**
     * 新增
     * @param user user对象
     * @return ok或fail
     */
    @Override
    public ResultBean add(User user) {
        if (user == null) {
            return ResultBean.fail("不能为空");
        }

        for (User user1 : dao.selectAll()) {
            if (user.getName().equals(user1.getName())){
                if (user.getIdCard().equals(user1.getIdCard())){
                    return ResultBean.fail("用户已存在");
                }
            }
        }
        if(!StringUtils.hasLength(user.getAddress())){
            return ResultBean.fail("住址不能为空");
        }
        if (!StringUtils.hasLength(user.getPhone())) {
            return ResultBean.fail("手机号不能为空");
        }

        String idCard = user.getIdCard();

        if (idCard.length() < 18){
            return ResultBean.fail("证件号码输入错误");
        }

        String key = "V1oI3GzV3xkqhQsBmaYapw==";
        String pass = PassUtils.aesenc(key, user.getPassword());
        user.setPassword(pass);
        log.info(user.toString());
        if (dao.add(user) > 0) {
            return ResultBean.ok();
        }else {
            return ResultBean.fail();
        }
    }

    /**
     * 分页查询
     * @param page 页数
     * @param limit 关键字
     * @return 分页数据
     */
    @Override
    public PageBean selectAll(int page, int limit) {
        //1.分页
        PageHelper.startPage(page, limit);
        //20获取分页的结果
        PageInfo<User> pageInfo = new PageInfo<>(dao.selectAll());
        //3.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
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
    public ResultBean update(User user) {
        if(dao.update(user)>0){
            return ResultBean.ok();
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean queryPageWhere(String name, int sex, int page, int limit) {
        //1.条件处理
        if(StringUtils.hasLength(name)){
            name="%"+name+"%";
        }else{
            name=null;
        }
        //2.分页
        PageHelper.startPage(page, limit);
        //3.获取分页结果
        PageInfo<User> pageInfo=new PageInfo<>(dao.selectWhere(name, sex));
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
    public List<User> queryAll() {
        return dao.selectAll();
    }

    @Override
    public ResultBean saveBatch(MultipartFile file) throws Exception {
        String key = "V1oI3GzV3xkqhQsBmaYapw==";

        if(!file.isEmpty()){
            //excel解析
            List<UserExcel> list= EasyExcel.read(file.getInputStream(), UserExcel.class, new ReadListener() {
                @Override
                public void onException(Exception e, AnalysisContext analysisContext) throws Exception {}
                @Override
                public void invokeHead(Map map, AnalysisContext analysisContext) {}
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
            List<UserExcel> userExcels = new ArrayList<>();
            for (UserExcel userExcel : list) {

                String pass = PassUtils.aesenc(key, userExcel.getPassword());
                userExcel.setPassword(pass);
                userExcels.add(userExcel);
            }
            if(dao.addBatch(userExcels)>0){
                return ResultBean.ok();
            }
        }
        return ResultBean.fail();
    }

    @Override
    public ResultBean addMessage(AdminMessage message) {
        if (dao.addMessage(message) > 0) {
            return ResultBean.ok();
        }
        return ResultBean.fail();
    }

    @Override
    public PageBean userNotice(String title, int page, int limit) {

        //1.条件处理
        if(StringUtils.hasLength(title)){
            title="%"+title+"%";
        }else{
            title=null;
        }
        //2.分页
        PageHelper.startPage(page, limit);
        //3.获取分页结果
        PageInfo<AdminNotice> pageInfo=new PageInfo<>(dao.selectNotice(title));
        //4.返回分页的数据
        return PageBean.bean(pageInfo.getTotal(), pageInfo.getList());
    }



    @Override
    public List<UserCountDto> selectTj() {
        return dao.selectTj();
    }

    @Override
    public int selectTotal() {
        return dao.userTotal();
    }
}
