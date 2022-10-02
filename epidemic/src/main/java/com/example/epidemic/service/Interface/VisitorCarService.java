package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.VisitorCar;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VisitorCarService {
    /**新增访客
     * @param visitorCar
     * @return
     */
    ResultBean add(VisitorCar visitorCar);
    /**
     * 分页查询所有的访客信息
     */
    List<VisitorCar> selectAll();
    /**
     * 删除访客信息
     * @param id
     * @return
     */
    ResultBean del(int id);
    /**
     * 修改访客信息
     * @param visitorCar
     * @return
     */
    ResultBean update(VisitorCar visitorCar);
    /**
     * 通过条件查询访客信息
     * @param name
     * @param page
     * @param limit
     * @return
     */
    PageBean queryPageWhere(String name, int page, int limit);
    /**
     * 删除所有选中访客信息
     * @param ids
     * @return
     */
    ResultBean delBatch(int[] ids);
    /**
     * 实现导入
     */
    ResultBean addBatch(MultipartFile file) throws Exception;
}
