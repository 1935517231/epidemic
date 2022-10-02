package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsApprove {
    /** 主键 */
    private Integer id ;
    /** 申请人 */
    private String username ;
    /** 申请物资 */
    private String goodsname ;
    /** 数量 */
    private Integer count ;
    /** 单位 */
    private String unit ;
    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time ;
    /** 状态表示符;默认为1有效 */
    private Integer state ;
}
