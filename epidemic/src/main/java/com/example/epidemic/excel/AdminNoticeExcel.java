package com.example.epidemic.excel;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: gpt
 * @Date: 2022/04/04/20:19
 * @Description:
 */
@Data
public class AdminNoticeExcel {
    /** 标题 */
    private String title ;
    /** 内容 */
    private String content ;
    /** 发起人 */
    private String aname ;
    /** 状态
     * 为1则是重要通知
     * 为2是非重要通知*/
    private Integer flag ;
}
