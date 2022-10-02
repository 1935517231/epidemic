package com.example.epidemic.excel;

import lombok.Data;

@Data
public class VisitorItemsExcel {
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
