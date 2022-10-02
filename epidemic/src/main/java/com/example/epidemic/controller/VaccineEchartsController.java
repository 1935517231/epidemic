package com.example.epidemic.controller;


import com.example.epidemic.entity.VaccineUser;
import com.example.epidemic.service.Interface.VaccineUserService;
import com.example.epidemic.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/api/echarts")
public class VaccineEchartsController {
@Autowired
private VaccineUserService vaccineUserService;
    @RequestMapping("find.do")
    public ResultBean find(){
        List<VaccineUser> list = vaccineUserService.findYes();
        Integer q1=0;
        Integer q2=0;
        Integer q3=0;
        Integer q4=0;
        Calendar cal = Calendar.getInstance();

        for (VaccineUser user :list){
            Date createTime = user.getCtime();
            cal.setTime(user.getCtime());
            //老外计算月份从0开始，转换为国内月份需要加1
            int month = cal.get(cal.MONTH) + 1;
            if (month == 1 ||month==2||month==3){
               q1+=1;
            }else if (month == 4 ||month==5||month==6){
                q2+=1;
            }else if(month == 7 ||month==8||month==9){
                q3+=1;
            }else if (month == 10 ||month==11||month==12){
                q4+=1;
            }
        }
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(q1);
        integers.add(q2);
        integers.add(q3);
        integers.add(q4);

        return ResultBean.ok(integers);
    }
}
