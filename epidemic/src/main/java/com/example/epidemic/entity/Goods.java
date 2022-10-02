package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    /** 主键 */
    private Integer g_id ;
    /** 物品名 */
    private String g_name ;
    /** 物品数量 */
    private Integer g_count ;
    /** 单位 */
    private String g_unit ;
    /** 物资类型 */
    private Integer g_tid ;
    /** 物资状态 */
    private Integer g_st_id ;
    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date g_ctime ;

}
