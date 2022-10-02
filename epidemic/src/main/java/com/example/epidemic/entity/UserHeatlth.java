package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author coder gaj
 * @Date 2022/4/1 14:48
 * @Version 1.0
 */

/**
 * 健康信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserHeatlth {
    private Integer id ;
    /** 用户的id */
    private Integer uId ;
    /** 身体状况 */
    private String plCondition ;
    /** 体温自查 */
    private String selTemp ;
    /** 体温自查时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    @DateTimeFormat(pattern = "yyyy-MM-dd ")//接受日期参数
    private Date selTempTime ;
    /** 体温被查时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss ")//指定JSON转换的日期格式
    @DateTimeFormat(pattern = "yyyy-MM-dd ")//接受日期参数
    private Date byTempTime ;
    /** 体温被查 */
    private String byTemp ;
    /** 体温被哪个管理员查的 */
    private Integer aId ;
    /** 1正常,2关注,3被隔离 */
    private Integer flag ;

    public UserHeatlth(Integer id, String plCondition, String selTemp, Date selTempTime, Date byTempTime, String byTemp, Integer flag) {
        this.id = id;
        this.plCondition = plCondition;
        this.selTemp = selTemp;
        this.selTempTime = selTempTime;
        this.byTempTime = byTempTime;
        this.byTemp = byTemp;
        this.flag = flag;
    }

    public UserHeatlth(Integer uId, String plCondition, String selTemp, Date selTempTime, Date byTempTime, String byTemp, Integer aId, Integer flag) {
        this.uId = uId;
        this.plCondition = plCondition;
        this.selTemp = selTemp;
        this.selTempTime = selTempTime;
        this.byTempTime = byTempTime;
        this.byTemp = byTemp;
        this.aId = aId;
        this.flag = flag;
    }
}
