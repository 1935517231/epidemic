package com.example.epidemic.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lee
 * @date 2022/9/18  10:24
 */
//Layui 的数据表格需要的数据格式
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean<T> {
    private int code;//状态码 成功为0
    private String msg;//说明消息
    private long count;//总条数
    private List<T> data;//查询的结果集

    /**
     * 生成分页对象*/
    public static <T> PageBean bean(long count,List<T> list){
        return new PageBean(0,"OK",count,list);
    }
}

