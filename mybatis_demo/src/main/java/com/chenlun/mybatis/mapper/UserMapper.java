package com.chenlun.mybatis.mapper;

import com.chenlun.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();
    int updateUser();
    int deleteUser();
    User getUserById();
    List<User> getAllUsers();
}
