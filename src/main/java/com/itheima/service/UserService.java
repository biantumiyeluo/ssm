package com.itheima.service;

import com.itheima.domain.PageBean;
import com.itheima.pojo.User;

import java.util.List;

public interface UserService {
    //查询所有用户信息
    PageBean<User> findAll(Integer currentPage, Integer pageSize, User params);

    //添加用户信息
    void add(User user);

    //删除用户信息
    void delete(int id);

    //根据id查询用户
    User findId(int id);

    //修改用户信息
    void update(User user);

    //批量删除
    void deleteSelect(int[] checkbox);

    //查询所用用户信息
    List<User> findTotal();

    //login
    User findUser(User user);
}
