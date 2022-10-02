package com.example.epidemic.excel;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class VisitorMessageExcel { /** 主键 */
private Integer id ;
    /** 姓名 */
    private String name ;
    /** 留言 */
    private String message ;
    /** 留言时间 */
    @DateTimeFormat( "yyyy-MM-dd HH:mm:ss")//接受日期参数
    private Date ctime ;
    /** 状态
     * 0 正常
     * 1 不显示
     */
    private Integer status ;
}
