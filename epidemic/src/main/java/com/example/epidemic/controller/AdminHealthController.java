package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;

import com.example.epidemic.dto.AdminHealthDto;
import com.example.epidemic.entity.AdminHealth;
import com.example.epidemic.service.Interface.AdminHealthService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/01/20:57
 * @Description:
 */
@RequestMapping("/api/adminHealth/")
@RestController
public class AdminHealthController {
    @Autowired
    private AdminHealthService service;

    /**新增方法
     *
     * @param admin
     * @return
     */
    @PostMapping("add.do")
    public ResultBean add(AdminHealth admin) {
        return service.add(admin);
    }

    /**查询
     *
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("selectAll.do")
    public PageBean select(int page, int limit) {
        return service.selectAll(page, limit);
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
    public ResultBean update(AdminHealth admin) {
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
        List<AdminHealthDto> list = service.queryAll();
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),AdminHealthDto.class).
                sheet("自动导出").doWrite(list);
    }

    //数据导入
    @RequestMapping("upload.do")
    public ResultBean upload(MultipartFile file) throws Exception {
        return service.addBatch(file);
    }
}
