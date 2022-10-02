package com.example.epidemic.excel;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

/**
 * @Author coder gaj
 * @Date 2022/4/5 16:28
 * @Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserNucleateExcel {
    /**id*/
    private Integer id ;
    /**居民性名*/
    private String name;

    /** 采样时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    @DateTimeFormat( "yyyy-MM-dd ")//接受日期参数
    private String collectTime ;
    /** 检测时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    @DateTimeFormat( "yyyy-MM-dd ")//接受日期参数
    private String testTime ;
    /** 加测结果,1为阴,2为阳 */
    private Integer result ;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    @DateTimeFormat( "yyyy-MM-dd ")//接受日期参数
    private String ctime ;
}
