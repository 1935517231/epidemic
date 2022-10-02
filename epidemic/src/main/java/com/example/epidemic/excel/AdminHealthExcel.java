package com.example.epidemic.excel;

import lombok.Data;

import java.util.Date;

/**
 * @Author: gpt
 * @Date: 2022/04/04/17:45
 * @Description:
 */
@Data
public class AdminHealthExcel {
    /** 管理员的id */
    private Integer aid ;
    /** 体温 */
    private Double temperature ;
    /** 核酸情况 */
    private String nucleic_acid ;
    /** 健康码 */
    private String health_code ;
    /** 14天内是否去过中高风险地区 */
    private String flag ;
}
