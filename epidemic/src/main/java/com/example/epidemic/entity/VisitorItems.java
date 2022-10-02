package com.example.epidemic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitorItems {
    /** 主键ID*/
    private Integer id ;
    /** 名字 */
    private String name ;
    /** 物品名 */
    private String items ;
    /** 数量 */
    private Integer number ;
    /** 状态 */
    private Integer status ;
}
