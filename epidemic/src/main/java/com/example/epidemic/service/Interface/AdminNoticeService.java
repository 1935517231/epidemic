package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.AdminNotice;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/01/17:06
 * @Description:
 */
public interface AdminNoticeService {
    /**新增通告
     * @param adminNotice
     * @return
     */
    ResultBean add(AdminNotice adminNotice);
    /**
     * 分页查询所有的通告信息
     * @return
     */
    ResultBean selectAll();

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    ResultBean del(int id);

    /**
     * 修改数据
     * @param adminNotice
     * @return
     */
    ResultBean update(AdminNotice adminNotice);

    /**
     * 根据id模糊查询数据
     * @param title
     * @param page
     * @param limit
     * @return
     */
    PageBean selectByName(String title, int page, int limit);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    ResultBean delBatch(int[] ids);

    ResultBean addBatch(MultipartFile file) throws Exception;

    List<AdminNotice> queryAll();
}
