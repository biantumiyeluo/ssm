package com.itheima.test;

import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @PackageName: com.itheima.test
 * @ClassName: TestDemo
 * @Author: renpengzhi
 * @Date: 2019/11/20 0020 下午 7:04
 * @Description: //TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.findAll();
    }
}
