package com.example.epidemic.service.Interface;


import com.example.epidemic.dto.AdminCountDto;
import com.example.epidemic.entity.Admin;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: gpt
 * @Date: 2022/03/31/17:42
 * @Description:
 */
public interface AdminService {
    /**新增管理员
     * @param admin
     * @return
     */
    ResultBean add(Admin admin);
    /**
     * 查询所有的管理员信息
     * @param
     * @param
     * @return
     */
    List<Admin> selectAll();

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    ResultBean del(int id);

    /**
     * 修改数据
     * @param admin
     * @return
     */
    ResultBean update(Admin admin);

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
     * 实现导入
     */
    ResultBean addBatch(MultipartFile file) throws Exception;

    ResultBean login(Admin admin, HttpSession session);

    List<AdminCountDto> selectTj();

    int selectTotal();
}
