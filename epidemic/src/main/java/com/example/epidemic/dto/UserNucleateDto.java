package com.example.epidemic.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author coder gaj
 * @Date 2022/4/5 15:18
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserNucleateDto {

    /**id*/
    private Integer id ;
    /**居民性名*/
    private String name;
    /** uid */
    private Integer uId ;
    /** 采样时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接受日期参数
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    private Date collectTime ;
    /** 检测时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接受日期参数
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    private Date testTime ;
    /** 加测结果,1为阴,2为阳 */
    private Integer result ;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//接受日期参数
    private Date ctime ;
}
