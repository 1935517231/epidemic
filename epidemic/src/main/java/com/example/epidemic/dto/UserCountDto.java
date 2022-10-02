package com.example.epidemic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lee
 * @date 2022/9/18  10:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCountDto {
    /**用户住址*/
    private String address;
    /**每栋楼的用户数量*/
    private int num;
}
