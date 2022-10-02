package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;
import com.example.epidemic.entity.AdminMessage;
import com.example.epidemic.entity.User;
import com.example.epidemic.service.Impl.UserServiceImpl;
import com.example.epidemic.service.Interface.UserService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author lee
 * @date 2022/9/18  10:16
 */
@RestController
@RequestMapping("/api/user/")
@Slf4j
public class UserController {
    @Resource
    private UserService service;

    /**
     * 登录
     * @param user 封装谓user对象,
     * @return 成功或失败
     */
    @RequestMapping ("login.do")
    public ResultBean login(User user, HttpSession session) {
          log.info(user.toString());
//        User user = new User();
//        user.setName(map.get("name") + "");
//        user.setPassword(map.get("password") + "");
        return service.login(user, session);
    }

    /**
     * 新增用户
     * @param user 封装谓user对象,
     * @return ok 或fail
     */
    @RequestMapping("add.do")
    public ResultBean add(User user) {

        return service.add(user);
    }

    /**
     * 分页查询
     * @param page 页数
     * @param limit  分页
     * @return user集合
     */
    @GetMapping("selectAll.do")
    public PageBean selectAll(int page, int limit) {
        //System.out.println("nihao ");
        return service.selectAll(page, limit);
    }

    /**
     * 修改
     * @param user 对选
     * @return ok/fail
     */
    @PostMapping("update.do")
    public ResultBean update(User user){
        return service.update(user);
    }
    //删除
    @PostMapping("del.do")
    public ResultBean del(int id){
        return service.del(id);
    }

    //查询 条件
    @GetMapping("pagewhere.do")
    public PageBean page(String name,int sex,int page,int limit){
        return service.queryPageWhere(name,sex,page,limit);
    }
    //批量删除 JSON格式的数据请求
    @PostMapping("delbatch.do")
    public ResultBean del(@RequestBody int[] ids){
        return service.delBatch(ids);
    }

    //数据导出
    @GetMapping("downAll.do")
    public void down(HttpServletResponse response) throws IOException {
        //1.查询数据
        List<User> list=service.queryAll();
        //2.设置响应消息头
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),User.class).
                sheet("自动导出").doWrite(list);
    }
    //数据导入，Excel上传-解析-批量新增
    @RequestMapping("upload.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        System.out.println("批量导入");
        System.out.println(file);
        return service.saveBatch(file);
    }

    //用户留言
    @PostMapping("addMessage.do")
    public ResultBean addMessage(AdminMessage message) {
        return service.addMessage(message);
    }

    @RequestMapping("selectTj.do")
    public ResultBean selectTj() {
        return ResultBean.ok(service.selectTj());
    }

    //用户接收管理员通知
    @RequestMapping("userNotice.do")
    public PageBean userNotice(String title, int page, int limit) {
        return service.userNotice(title,page, limit);
    }

    //查询管理员的总个数
    @GetMapping("userTotal.do")
    public ResultBean selectTotal() {
        return ResultBean.ok(service.selectTotal());
    }

    //退出
    @RequestMapping("userLogout.do")
    @ResponseBody
    public ResultBean userLogout(HttpSession session) {
        if (session != null) {
            session.invalidate();
        }
        return ResultBean.ok("退出成功");
    }
}
