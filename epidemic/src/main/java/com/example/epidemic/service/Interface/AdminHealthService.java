package com.example.epidemic.service.Interface;


import com.example.epidemic.dto.AdminHealthDto;
import com.example.epidemic.entity.AdminHealth;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/01/20:41
 * @Description:
 */
public interface AdminHealthService {
    /**新增管理员
     * @param adminHealth
     * @return
     */
    ResultBean add(AdminHealth adminHealth);
    /**
     * 分页查询所有的管理员信息
     * @return
     */
    PageBean selectAll(int page, int limit);

    List<AdminHealthDto> queryAll();

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    ResultBean del(int id);

    /**
     * 修改数据
     * @param adminHealth
     * @return
     */
    ResultBean update(AdminHealth adminHealth);

    /**
     * 根据用户名模糊查询数据
     * @param name
     * @param page
     * @param limit
     * @return
     */
    PageBean selectByName(String name,int page,int limit);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    ResultBean delBatch(int[] ids);

    ResultBean addBatch(MultipartFile file) throws Exception;
}
