package com.example.epidemic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitorCountDto {
    /**访客住址*/
    private String addr;
    /**每栋楼的用户数量*/
    private int num;
}
