package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor {
    /** 主键 */
    private Integer id ;
    /** 用户名 */
    private String name ;
    /** 手机号 */
    private String phone ;
    /** 访问地址 */
    private String addr ;
    /** 详情描述 */
    private String comment ;
    /** 门牌号 */
    private Integer sid ;
    /** 状态 */
    private Integer status ;
}

