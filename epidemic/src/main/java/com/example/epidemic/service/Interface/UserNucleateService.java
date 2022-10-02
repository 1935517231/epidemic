package com.example.epidemic.service.Interface;


import com.example.epidemic.dto.UserNucleateDto;
import com.example.epidemic.excel.UserNucleateExcel;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/5 15:12
 * @Version 1.0
 */

public interface UserNucleateService {
    /**
     * 新增
     * @param userNucleateDto userNucleateDto对象
     * @return OK或fail
     */
    ResultBean add(UserNucleateDto userNucleateDto);



    //删除
    ResultBean del(int id);

    //查询 条件
    PageBean queryPageWhere(String name, int page, int limit);
    //批量删除
    ResultBean delBatch(int[] ids);

    List<UserNucleateExcel> queryAll();


}
