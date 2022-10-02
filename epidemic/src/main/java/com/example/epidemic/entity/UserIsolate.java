package com.example.epidemic.entity;

/**
 * @Author coder gaj
 * @Date 2022/4/1 20:24
 * @Version 1.0
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**居家隔离*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserIsolate {
    /**居家隔离表id*/
    private Integer id ;
    /** 居民性名 */
    private String name ;
    /** 隔离起始时间确认 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")//接受日期参数
    @JsonFormat(pattern = "yyyy-MM-dd")//指定JSON转换的日期格式
   private Date isoSure ;
      /** 居家隔离开始 */
      @DateTimeFormat(pattern = "yyyy-MM-dd")//接受日期参数
      @JsonFormat(pattern = "yyyy-MM-dd")//指定JSON转换的日期格式
    private Date isoStart ;
    /** 居家隔离结束 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")//接受日期参数
    @JsonFormat(pattern = "yyyy-MM-dd")//指定JSON转换的日期格式
    private Date isoEnd ;
    /** 居家隔离时长 */
    private Integer isoTotal ;
    /** 状态1正常,2带走 */
    private Integer flag ;
}
