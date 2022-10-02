package com.example.epidemic.excel;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: gpt
 * @Date: 2022/04/04/14:18
 * @Description:
 */
@Data
public class AdminExcel {
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

}
