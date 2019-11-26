package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    public List<User> findAll(User params);

    //添加用户信息
    void save(User user);

    //删除信息
    void dele(int id);

    //修改用户信息
    void udate(User user);

    //根据id查询用户信息
    User findById(int id);

    void deleteSelect(int[] checkbox);

    //total user
    List<User> findTotal();

    //login
    User findUser(User user);
}
