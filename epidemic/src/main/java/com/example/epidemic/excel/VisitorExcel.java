package com.example.epidemic.excel;

import lombok.Data;

@Data
public class VisitorExcel {
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
