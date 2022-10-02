package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsPurchase {
    /** 主键 */
    private Integer gp_id ;
    /** 管理员名字 */
    private String gp_admin ;
    /** 物资名称 */
    private String gp_gname ;
    /** 采购数量 */
    private Integer gp_count ;
    /** 单位 */
    private String gp_unit ;
    /** 花费金额 */
    private Double gp_money ;
    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gp_time ;
    /** 状态;表示这条数据是否有效，默认为1有效 */
    private Integer gp_state ;
    /** 物资类型 */
    private Integer gp_tid ;
}
