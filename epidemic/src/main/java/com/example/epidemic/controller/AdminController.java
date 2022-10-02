package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;
import com.example.epidemic.entity.Admin;
import com.example.epidemic.service.Impl.AdminServiceImpl;
import com.example.epidemic.service.Interface.AdminService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/03/31/17:52
 * @Description:
 */
@RequestMapping("/api/admin/")
@RestController
public class AdminController {
    @Autowired
    private AdminService service;

    /**新增方法
     *
     * @param admin
     * @return
     */
    @PostMapping("add.do")
    public ResultBean add(Admin admin) {
        return service.add(admin);
    }

    /**查询
     *
     * @param
     * @param
     * @return
     */
    @GetMapping("selectAll.do")
    public List<Admin> select() {
        return service.selectAll();
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @PostMapping("del.do")
    public ResultBean del(int id) {
        return service.del(id);
    }

    /**
     * 修改
     * @param admin
     * @return
     */
    @RequestMapping("update.do")
    public ResultBean update(Admin admin) {
        return service.update(admin);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @PostMapping("delBatch.do")
    public ResultBean delBatch(@RequestBody int[] ids) {
        return service.delBatch(ids);
    }

    /**
     * 根据名字查询
     * @param name
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("selectByName.do")
    public PageBean selectByName(String name, int page, int limit) {
        return  service.selectByName(name, page, limit);
    }

    //数据导出  下载
    @GetMapping("downall.do")
    public void down(HttpServletResponse response) throws Exception {
        List<Admin> list = service.selectAll();
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),Admin.class).
                sheet("自动导出").doWrite(list);
    }

    //数据导入
    @RequestMapping("upload.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        return service.addBatch(file);
    }

    //登录
    @RequestMapping("login.do")
    public ResultBean login(Admin admin, HttpSession session) {
        return service.login(admin, session);
    }

    @RequestMapping("selectTj.do")
    public ResultBean selectTj() {
        return ResultBean.ok(service.selectTj());
    }

    //查询管理员的总个数
    @GetMapping("totalAdmin.do")
    public ResultBean selectTotal() {
        return ResultBean.ok(service.selectTotal());
    }

    //退出
    @RequestMapping("adminLogout.do")
    @ResponseBody
    public ResultBean adminLogout(HttpSession session) {
        if (session != null) {
            session.invalidate();
        }
        return ResultBean.ok("退出成功");
    }

}
