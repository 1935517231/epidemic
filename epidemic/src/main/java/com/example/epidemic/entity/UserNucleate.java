package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author coder gaj
 * @Date 2022/4/5 15:10
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserNucleate {
    /**id*/
    private Integer id ;
    /** uid */
    private Integer uId ;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    @DateTimeFormat(pattern = "yyyy-MM-dd ")//接受日期参数
    private Date collectTime ;
    /** 检测时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    @DateTimeFormat(pattern = "yyyy-MM-dd ")//接受日期参数
    private Date testTime ;
    /** 加测结果,1为阴,2为阳 */
    private Integer result ;

    @DateTimeFormat(pattern = "yyyy-MM-dd ")//接受日期参数
    private Date ctime ;
}
