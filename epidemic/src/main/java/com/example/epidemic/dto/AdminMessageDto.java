package com.example.epidemic.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: gpt
 * @Date: 2022/04/02/15:51
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminMessageDto {
    private Integer id ;

    /** 用户需求内容 */
    private String comment ;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime ;
    /** 状态
     * 1表示已解决
     * 2表示未解决需要去解决*/
    private String flag ;

    private String name;

    private String phone;

    private String address;
}
