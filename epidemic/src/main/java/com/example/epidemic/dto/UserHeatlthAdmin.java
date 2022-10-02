package com.example.epidemic.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author coder gaj
 * @Date 2022/4/1 15:11
 * @Version 1.0
 */

/**
 * 居民体温查询
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserHeatlthAdmin {
    private String name;
    private Integer id ;
    /** 用户的id */
    private Integer uId ;
    /** 身体状况 */
    private String plCondition ;
    /** 体温自查 */
    private String selTemp ;
    /** 体温自查时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接受日期参数
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    private Date selTempTime ;
    /** 体温被查时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接受日期参数
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    private Date byTempTime ;
    /** 体温被查 */
    private String byTemp ;
    /** 体温被哪个管理员查的 */
    private Integer aId ;
    /** 1正常,2关注,3被隔离 */
    private Integer flag ;
    private String adminName;

    public UserHeatlthAdmin(String name, Integer id, String plCondition, String selTemp, Date selTempTime, Date byTempTime, String byTemp, Integer flag, String adminName) {
        this.name = name;
        this.id = id;
        this.plCondition = plCondition;
        this.selTemp = selTemp;
        this.selTempTime = selTempTime;
        this.byTempTime = byTempTime;
        this.byTemp = byTemp;
        this.flag = flag;
        this.adminName = adminName;
    }
}
