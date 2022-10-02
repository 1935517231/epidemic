package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.UserIsolate;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/1 20:28
 * @Version 1.0
 */

public interface UserIsolateService {
    ResultBean delBatch(int[] ids);

    PageBean queryPageWhere(String name, int page, int limit);

    ResultBean del(int id);

    ResultBean update(UserIsolate userIsolate);

    PageBean selectAll(int page, int limit);

    ResultBean add(UserIsolate userIsolate);

    List<UserIsolate> queryAll();

    //实现导入
    ResultBean saveBatch(MultipartFile file) throws Exception;
}
