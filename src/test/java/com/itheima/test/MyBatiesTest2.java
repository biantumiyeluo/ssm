package com.itheima.test;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @PackageName: com.itheima.test
 * @ClassName: MyBatiesTest2
 * @Author: renpengzhi
 * @Date: 2019/11/20 0020 下午 8:41
 * @Description: //TODO
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyBatiesTest2 {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        List<User> userList = userService.findAll();
        System.out.println(userList);
    }
}
