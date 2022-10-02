package com.example.epidemic.controller;


import com.example.epidemic.entity.VaccineNum;
import com.example.epidemic.service.Interface.VaccineNumService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/num")
public class VaccineNumController {

    @Autowired
    VaccineNumService vaccineNumService;
    @GetMapping("/select.do")
    public PageBean<VaccineNum> select(Integer page, Integer limit){
        return  vaccineNumService.selectAll(page,limit);
    }

     //注射加强针
    @GetMapping("/update.do")
    public ResultBean update(Integer id){

        vaccineNumService.update(id);
      return ResultBean.ok();
    }




}
