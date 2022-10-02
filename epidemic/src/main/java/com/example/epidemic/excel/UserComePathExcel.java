package com.example.epidemic.excel;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

/**
 * @Author coder gaj
 * @Date 2022/4/2 15:58
 * @Version 1.0
 */

/**用户来市信息*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserComePathExcel {
    /** 路径id */
    private Integer id ;
    /** 居民性名 */
    private String name ;
    /** 手机号 */
    private String phone ;
    /** 出发地 */
    private String outLocation ;
    /** 出发时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    @DateTimeFormat( "yyyy-MM-dd ")//接受日期参数
    private String goTime ;
    /** 交通方式 */
    private String transport ;
    /** 车牌号/火车班次 */
    private String cardId ;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    @DateTimeFormat( "yyyy-MM-dd ")//接受日期参数
    private String ctime ;
}
