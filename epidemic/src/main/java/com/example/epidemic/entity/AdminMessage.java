package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lee
 * @date 2022/9/18  10:26
 * description:用户留言管理
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminMessage {
    private Integer id ;
    /** 用户id */
    private Integer uid ;
    /** 用户需求内容 */
    private String comment ;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime ;
    /** 状态
     * 1表示已解决
     * 2表示未解决需要去解决*/
    private String flag ;
}