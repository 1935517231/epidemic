package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: gpt
 * @Date: 2022/04/04/23:25
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnHealth {
    private Integer id ;
    /** 用户id */
    private Integer uid ;
    /** 体温 */
    private Double temp ;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime ;
    /**状态   1表示正常   2表示异常 */
    private String flag ;
}
