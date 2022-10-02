package com.example.epidemic.excel;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author coder gaj
 * @Date 2022/4/4 18:37
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserHeathAdminExcel {
    /** 用户的id */
    private Integer id ;
    private Integer uId;
    private Integer aId;
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

    public UserHeathAdminExcel(Integer uId,  String plCondition, String selTemp, String selTempTime, String byTempTime, String byTemp,Integer aId, Integer flag) {
        this.uId = uId;
        this.aId = aId;
        this.plCondition = plCondition;
        this.selTemp = selTemp;
        this.selTempTime = selTempTime;
        this.byTempTime = byTempTime;
        this.byTemp = byTemp;
        this.flag = flag;
    }
}
