package com.example.epidemic.excel;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import java.util.Date;

/**
 * @Author coder gaj
 * @Date 2022/4/4 14:29
 * @Version 1.0
 */
@Data
public class UserHeathExcel {
    /** 用户的id */
    private Integer id ;
    private String name;
    /** 身体状况 */
    private String plCondition ;
    /** 体温自查 */
    private String selTemp ;
    /** 体温自查时间 */
    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")//接受日期参数
    private String selTempTime ;
    /** 体温被查时间 */
    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")//接受日期参数
    private String byTempTime ;
    /** 体温被查 */
    private String byTemp ;
    /** 体温被哪个管理员查的 */
    private String adminName;
    /** 1正常,2关注,3被隔离 */
    private Integer flag ;



}
