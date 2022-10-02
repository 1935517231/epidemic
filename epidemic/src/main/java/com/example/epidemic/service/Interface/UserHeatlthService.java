package com.example.epidemic.service.Interface;


import com.example.epidemic.dto.UserHeatlthAdmin;
import com.example.epidemic.entity.OwnHealth;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author coder gaj
 * @Date 2022/4/1 16:20
 * @Version 1.0
 */

public interface UserHeatlthService {

    ResultBean add(UserHeatlthAdmin userHeatlthAdmin);

    PageBean selectAll(int page, int limit);

    ResultBean del(int id);

    ResultBean delBatch(int[] ids);

    ResultBean update(UserHeatlthAdmin userHeatlthAdmin);

    PageBean queryPageWhere(String name, int page, int limit);


    List<UserHeatlthAdmin> queryAll();

    //实现导入
    ResultBean saveBatch(MultipartFile file) throws Exception;

    ResultBean addOwnHealth(OwnHealth ownHealth);

    PageBean queryPageByOne(String name, int page, int limit);
}
