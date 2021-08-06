package com.liuhao.mapper;

import com.liuhao.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2021/8/5
 */
public interface UserMapper {
    public List<User> selectUser();

    public int addUser(User user);

    public int deleteUser(int id);
}
