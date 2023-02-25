package com.chenlun.mybatis.utils;

import com.chenlun.mybatis.mapper.ParameterMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {
    public static SqlSession getSqlSession(){
        InputStream is = null;
        SqlSession  sqlSession = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
            sqlSession=sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sqlSession;
    }
}
