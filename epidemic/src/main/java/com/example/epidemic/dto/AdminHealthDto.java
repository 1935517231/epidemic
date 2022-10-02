package com.example.epidemic.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: gpt
 * @Date: 2022/04/01/20:32
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminHealthDto {
    /** 序号*/
    private Integer id ;
    /** 管理员的id */
    private Integer aid ;
    /** 体温 */
    private Double temperature ;
    /** 核酸情况 */
    private String nucleic_acid ;
    /** 健康码 */
    private String health_code ;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime ;
    /** 14天内是否去过中高风险地区 */
    private String flag ;

    private String name;
    private String phone;
}
