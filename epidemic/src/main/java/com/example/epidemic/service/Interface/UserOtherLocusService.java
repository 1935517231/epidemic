package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.UserOtherLocus;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/2 14:27
 * @Version 1.0
 */

public interface UserOtherLocusService {
    ResultBean add(UserOtherLocus userOtherLocus);

    PageBean selectAll(int page, int limit);

    ResultBean update(UserOtherLocus userOtherLocus);

    ResultBean del(int id);

    PageBean queryPageWhere(String name, int page, int limit);

    ResultBean delBatch(int[] ids);

    List<UserOtherLocus> queryAll();

    //实现导入
    ResultBean saveBatch(MultipartFile file) throws Exception;
}
