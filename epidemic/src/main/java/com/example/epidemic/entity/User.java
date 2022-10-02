package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lee
 * @date 2022/9/18  10:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    /**
     * 居民性名
     */
    private String name;
    /**
     * 居民账号密码
     */
    private String password;
    /**
     * 居民手机号
     */
    private String phone;
    /**
     * 居民身份证号
     */
    private String idCard;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 籍贯
     */
    private String origin;
    /**
     * 住址
     */
    private String address;
    /**
     * 状态 1为在住,2为不在住
     */
    private Integer flag;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;

    public User(String name, String password, String phone, String idCard, Integer age, Integer sex, String origin, String address, Integer flag) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.idCard = idCard;
        this.age = age;
        this.sex = sex;
        this.origin = origin;
        this.address = address;
        this.flag = flag;
    }
}
