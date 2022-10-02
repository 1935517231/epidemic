package com.example.epidemic.excel;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitorCarExcel {
    /** 主键 */
    private Integer id ;
    /** 用户名 */
    private String name ;
    /** 车牌号 */
    private String license ;
    /** 进入时间 */
    @DateTimeFormat( "yyyy-MM-dd HH:mm:ss")//接受日期参数
    private Date ctime ;
    /** 车辆停放位置 */
    private String position ;
    /** 状态 */
    private Integer status ;
}
