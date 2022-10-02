package com.example.epidemic.controller;


import com.example.epidemic.entity.VaccineStatu;
import com.example.epidemic.service.Interface.VaccineStatuService;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/statu")
public class VaccineStatuController {
    @Autowired
    private VaccineStatuService vaccineStatuService;


    @GetMapping("/select.do")
    public PageBean<VaccineStatu> selectAll(Integer page, Integer limit, VaccineStatu vaccineStatu) {
        return vaccineStatuService.statuFindAll(page,limit,vaccineStatu);
    }
    @PostMapping("/update.do")
    public ResultBean update(VaccineStatu vaccineStatu){
        return vaccineStatuService.update(vaccineStatu);
    }


}
