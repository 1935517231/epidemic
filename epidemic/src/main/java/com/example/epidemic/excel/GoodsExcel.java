package com.example.epidemic.excel;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsExcel {
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
}
