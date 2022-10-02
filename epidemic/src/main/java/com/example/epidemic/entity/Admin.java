package com.example.epidemic.entity;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: gpt
 * @Date: 2022/03/31/17:24
 * @Description:管理员信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Integer id ;
    /** 用户名 */
    private String name ;
    /** 密码 */
    private String password ;
    /** 手机号 */
    private String phone ;
    /** 邮箱 */
    private String email ;
    /** 信息 */
    private String info ;
    /** 创建日期 ,timezone = "GMT+8"获取的时间加上8就是当前时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat("yyyy-MM-dd")
    private Date ctime ;
    /** 状态
     * 1表示正常
     * 2表示被冻结*/
    private Integer flag ;

}
