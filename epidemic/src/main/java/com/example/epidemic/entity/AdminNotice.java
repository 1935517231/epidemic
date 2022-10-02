package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lee
 * @date 2022/9/18  10:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminNotice {
    /** 主键 */
    private Integer id ;
    /** 标题 */
    private String title ;
    /** 内容 */
    private String content ;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime ;
    /** 发起人 */
    private String aname ;
    /** 状态
     * 为1则是重要通知
     * 为2是非重要通知*/
    private Integer flag ;
}
