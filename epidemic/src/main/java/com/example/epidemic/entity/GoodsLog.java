package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsLog {
    /** 主键 */
    private Integer id ;
    /** 物资 */
    private String goodsname ;
    /** 操作;记录对物资表的操作，包括1、新增数据，2、删除数据，3、修改物资名称，4、修改数量，5、修改单位，6、修改状态，7、修改物资属性等操作 */
    private String operate ;
    /** 操作结果;记录操作结果，包括：1、数据被删除，2、数据被添加，3、（操作前数据）--->（操作后数据） */
    private String result ;
    /** 操作人 */
    private String username ;
    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time ;
}
