package com.example.epidemic.controller;

import com.alibaba.excel.EasyExcel;

import com.example.epidemic.dto.AdminMessageDto;
import com.example.epidemic.service.Interface.AdminMessageService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/02/16:01
 * @Description:
 */
@RestController
@RequestMapping("/api/adminMessage/")
public class AdminMessageController {
    @Autowired
    private AdminMessageService service;
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
     * 删除
     * @param id
     * @return
     */
    @PostMapping("del.do")
    public ResultBean del(int id) {
        return service.del(id);
    }

    //数据导出  下载
    @GetMapping("downall.do")
    public void down(HttpServletResponse response) throws Exception {
        List<AdminMessageDto> list = service.queryAll();
        response.setHeader("Content-disposition", "attachment;filename=" +System.currentTimeMillis() + ".xlsx");
        //3.写出内容
        EasyExcel.write(response.getOutputStream(),AdminMessageDto.class).
                sheet("自动导出").doWrite(list);
    }

    @GetMapping("selectAll.do")
    @ResponseBody
    public ResultBean selectAll() {
        return service.selectAll();
    }

}
