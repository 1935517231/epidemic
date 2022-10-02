package com.example.epidemic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class VaccineNum {
    private Integer id;
    private Integer userId;
    private char isOk;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ctime;
    private long day;
    private VaccineUser vaccineUser;
}
