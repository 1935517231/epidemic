package com.example.epidemic.service.Interface;


import com.example.epidemic.dto.UserPathDto;
import com.example.epidemic.entity.UserComePath;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/2 16:03
 * @Version 1.0
 */

public interface UserComePathService {
    ResultBean add(UserComePath userComePath);

    PageBean selectAll(int page, int limit);

    ResultBean update(UserComePath userComePath);

    ResultBean del(int id);

    PageBean queryPageWhere(String name, int page, int limit);

    ResultBean delBatch(int[] ids);

    List<UserComePath> queryAll();

    //实现导入
    ResultBean saveBatch(MultipartFile file) throws Exception;

    List<UserPathDto> selectTj();
}
