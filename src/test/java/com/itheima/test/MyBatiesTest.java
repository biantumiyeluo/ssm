package com.itheima.test;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @PackageName: com.itheima.test
 * @ClassName: MyBatiesTest
 * @Author: renpengzhi
 * @Date: 2019/11/20 0020 下午 8:15
 * @Description: //TODO
 */
public class MyBatiesTest {

    private InputStream is;
    private SqlSession sqlSession;
    private UserMapper mapper;

    @Before
    public void setUp() throws Exception {
        is = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();

        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void close() throws Exception {
        sqlSession.commit();
        sqlSession.close();
        is.close();
    }

    @Test
    public void test1() {
        List<User> list = mapper.findAll(paramsUser);
        System.out.println(list);
    }
}
