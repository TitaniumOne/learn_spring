package com.liuhao.service;

import com.liuhao.dao.UserDao;
import com.liuhao.dao.UserDaoImpl;
import com.liuhao.dao.UserDaoMysqlImpl;

/**
 * Created by Administrator on 2021/8/2
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    //在客户端修改类型即可避免耦合过高，把创建类的主动权给客户

    //重要
    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }


}