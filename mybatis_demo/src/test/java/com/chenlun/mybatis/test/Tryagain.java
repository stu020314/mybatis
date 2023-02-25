package com.chenlun.mybatis.test;

import com.chenlun.mybatis.mapper.UserMapper;
import com.chenlun.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Tryagain {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.getUserById();
        List<User> list =mapper.getAllUsers();
//        sqlSession.commit();
       list.forEach(user-> System.out.println(user));
    }
}
