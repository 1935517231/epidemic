package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author coder gaj
 * @Date 2022/4/2 14:24
 * @Version 1.0
 */
/** 其他轨迹*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserOtherLocus {
    /** 其他轨迹信息id */
    private Integer id ;
    /** 居民性名 */
    private String name ;
    /** 居民手机号 */
    private String phone ;
    /** 是否有中高风险地区居住史(地区) */
    private String reside ;
    /** 是否接触过类似症状的人(描述) */
    private String contacPeo ;
    /** 是否有野生动物接触史 */
    private String contactAni ;
    /** 是否有农贸市场活动市 */
    private String contactMar ;
    /** 标记 1正常 2危险*/
    private Integer flag;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")//指定JSON转换的日期格式
    @DateTimeFormat(pattern = "yyyy-MM-dd ")//接受日期参数
    private Date ctime ;



}
