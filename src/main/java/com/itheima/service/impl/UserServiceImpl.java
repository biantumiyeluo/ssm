package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.domain.PageBean;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @PackageName: com.itheima.service.impl
 * @ClassName: UserServiceImpl
 * @Author: renpengzhi
 * @Date: 2019/11/20 0020 下午 6:59
 * @Description: //TODO
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //查询所有用户信息
    public PageBean<User> findAll(Integer currentPage, Integer pageSize, User user) {
        //设置分页数据
        PageHelper.startPage(currentPage, pageSize);

        User paramsUser = new User();
        if (user.getName() != null && user.getName().length() > 0) {
            paramsUser.setName("%" + user.getName() + "%");
        }
        if (user.getAddress() != null && user.getAddress().length() > 0) {
            paramsUser.setAddress(user.getAddress());
        }
        if (user.getEmail() != null && user.getEmail().length() > 0) {
            paramsUser.setEmail("%" + user.getEmail() + "%");
        }

        //分页查询
        Page<User> page = (Page<User>) userMapper.findAll(paramsUser);
        //封装分页数据
        PageBean<User> pageBean = new PageBean<User>();

        pageBean.setCurrentPage(page.getPageNum()); //设置当前页
        pageBean.setPageSize(page.getPageSize());  //当前显示条数
        pageBean.setTotalCount(Long.valueOf(page.getTotal()).intValue());   //总记录数
        pageBean.setTotalPage(page.getPages()); //总页数
        pageBean.setList(page.getResult());

        return pageBean;
    }

    //添加用户信息
    public void add(User user) {
        userMapper.save(user);
    }

    //删除用户信息
    public void delete(int id) {
        userMapper.dele(id);
    }

    //根据id查询用户
    public User findId(int id) {
        return userMapper.findById(id);
    }

    //update
    public void update(User user) {
        userMapper.udate(user);
    }

    //删除选中
    public void deleteSelect(int[] checkbox) {
        userMapper.deleteSelect(checkbox);
    }

    //total user
    public List<User> findTotal() {
        List<User> list = userMapper.findTotal();

        return list;
    }

    //login
    public User findUser(User user) {
        return userMapper.findUser(user);
    }


}
