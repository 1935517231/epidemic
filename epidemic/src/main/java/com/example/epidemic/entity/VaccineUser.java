package com.example.epidemic.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class VaccineUser {

    private Integer id;
    @ExcelProperty("姓名")
    private String  name;
    @ExcelProperty("是否打了疫苗")
    private String isInoculate;
    @ExcelProperty("打针的时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ctime;
    @ExcelProperty("地址")
    private String address;
    @ExcelProperty("疫苗类型")
    private String typeId;
    @ExcelProperty("打了几针")
    private Integer cnum;

}
