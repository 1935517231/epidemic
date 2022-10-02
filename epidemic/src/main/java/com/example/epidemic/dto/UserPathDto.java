package com.example.epidemic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author coder gaj
 * @Date 2022/4/5 22:54
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPathDto {
    private String outLocation;
    private Integer num;
}
