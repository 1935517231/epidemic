package com.example.epidemic.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lee
 * @date 2022/9/18  10:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultBean {
    private int code;
    private String msg;
    private Object data;
    //成功
    public static ResultBean ok(){
        return new ResultBean(200,"OK",null);
    }
    public static ResultBean ok(Object obj){
        return new ResultBean(200,"OK",obj);
    }
    //失败
    public static ResultBean fail(){
        return new ResultBean(400,"FAIL",null);
    }

    public static ResultBean fail(String msg){
        return new ResultBean(400,msg,null);
    }
}
