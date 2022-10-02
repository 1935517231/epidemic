package com.example.epidemic.service.Interface;



import com.example.epidemic.dto.AdminMessageDto;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;

import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/04/02/15:57
 * @Description:
 */
public interface AdminMessageService {
    /**
     * 根据用户名模糊查询数据
     * @param name
     * @param page
     * @param limit
     * @return
     */
    PageBean selectByName(String name, int page, int limit);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    ResultBean delBatch(int[] ids);

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    ResultBean del(int id);

    List<AdminMessageDto> queryAll();

    ResultBean selectAll();
}
