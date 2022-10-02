package com.example.epidemic.service.Interface;


import com.example.epidemic.entity.VisitorMessage;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VisitorMessageService {
    /**新增访客
     * @param visitorMessage
     * @return
     */
    ResultBean add(VisitorMessage visitorMessage);
    /**分页查询所有访客的留言
     * @return
     */
    List<VisitorMessage> selectAll();
    /**删除留言
     * @param id
     * @return
     */
    ResultBean del(int id);
    /**条件查询访客信息
     * @param page
     * @param limit
     * @param name
     * @return
     */
    PageBean queryPageWhere(String name, int page, int limit);
    /**删除选中留言
     * @param ids
     * @return
     */
    ResultBean delBatch(int[] ids);
    /**
     * 实现导入
     */
    ResultBean addBatch(MultipartFile file) throws Exception;
}
