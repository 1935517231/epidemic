package com.example.epidemic.service.Interface;

import com.example.epidemic.dto.UserCountDto;
import com.example.epidemic.entity.AdminMessage;
import com.example.epidemic.entity.User;
import com.example.epidemic.vo.PageBean;
import com.example.epidemic.vo.ResultBean;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author lee
 * @date 2022/9/18  10:21
 */
public interface UserService {
    ResultBean login(User user, HttpSession sesssion);
    /**
     * 新增
     * @param user user对象
     * @return OK或fail
     */
    ResultBean add(User user);

    /**
     * 分页查询
     * @param page 页数
     * @param limit 关键字
     * @return 分页结果集
     */
    PageBean selectAll(int page, int limit);

    //删除
    ResultBean del(int id);
    //修改
    ResultBean update(User user);
    //查询 条件
    PageBean queryPageWhere(String name, int sex, int page, int limit);
    //批量删除
    ResultBean delBatch(int[] ids);

    List<User> queryAll();

    //实现导入
    ResultBean saveBatch(MultipartFile file) throws Exception;

    ResultBean addMessage(AdminMessage message);

    /**
     * 统计   用于ecarts
     * @return  结果
     */
    List<UserCountDto> selectTj();

    PageBean userNotice(String title,int page, int limit);

    int selectTotal();
}
