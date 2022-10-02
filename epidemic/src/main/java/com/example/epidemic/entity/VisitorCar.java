package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitorCar {
    /** 主键 */
    private Integer id ;
    /** 用户名 */
    private String name ;
    /** 车牌号 */
    private String license ;
    /** 进入时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime ;
    /** 车辆停放位置 */
    private String position ;
    /** 状态 */
    private Integer status ;
}
