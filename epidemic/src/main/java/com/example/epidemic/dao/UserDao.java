package com.example.epidemic.dao;

import com.example.epidemic.dto.UserCountDto;
import com.example.epidemic.entity.AdminMessage;
import com.example.epidemic.entity.AdminNotice;
import com.example.epidemic.entity.User;
import com.example.epidemic.excel.UserExcel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lee
 * @date 2022/9/18  10:29
 */
@Mapper
public interface UserDao {
    //在mapper（dao）中,使用@param指定传参,否则会报找不到参数错误
    User login(@Param("name") String name,@Param("idCard") String idCard);
    /**
     * 新增
     * @param user 对象
     * @return i
     */
    int add(User user);

    /**
     * 查询
     * @return user集合
     */
    List<User> selectAll();

    /**
     * 删除
     * @param id 根据id
     * @return i
     */
    int del(int id);

    /**
     * 批量删除
     * @param ids id数组
     * @return i
     */
    int delBatch(int[] ids);

    /**修改
     *
     * @param user
     * @return
     */
    int update(User user);

    /**查询搜索条件
     *
     * @param name
     * @param sex
     * @return
     */
    List<User> selectWhere(@Param("name") String name, @Param("sex")int sex);

    int addBatch(List<UserExcel> list);

    int addMessage(AdminMessage message);

    List<UserCountDto> selectTj();

    List<AdminNotice> selectNotice(String title);

    /*统计用户人数*/
    int userTotal();
}
