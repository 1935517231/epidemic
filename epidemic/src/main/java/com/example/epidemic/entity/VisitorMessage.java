package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitorMessage {
    /** 主键 */
    private Integer id ;
    /** 姓名 */
    private String name ;
    /** 留言 */
    private String message ;
    /** 留言时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime ;
    /** 状态
     * 0 正常
     * 1 不显示
     */
    private Integer status ;
    }


