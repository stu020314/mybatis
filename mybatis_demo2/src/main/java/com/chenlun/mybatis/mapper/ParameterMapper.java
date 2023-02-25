package com.chenlun.mybatis.mapper;

import com.chenlun.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    List<User> getAllUsers();
    User getUserByUsername(String username);
    User checkLogin(String username,String password);
    User checkLohinByMap(Map<String,Object> map);
    int insertUser(User user);
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
}
