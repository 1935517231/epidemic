package com.example.epidemic.utils;

/**
 * @author lee
 * @date 2022/9/18  10:37
 */
public class StringUtils {
    /**
     * 实现字符串 非空校验*/
    public static boolean isNotEmpty(String... strs){
        boolean r=true;
        for(String s:strs){
            if(s==null || s.length()==0){
                r=false;
                break;
            }
        }
        return r;
    }
}
