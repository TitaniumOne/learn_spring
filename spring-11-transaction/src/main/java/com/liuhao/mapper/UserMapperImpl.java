package com.liuhao.mapper;

import com.liuhao.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by Administrator on 2021/8/5
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {

        User user = new User(4,"小44","21312");
        getSqlSession().getMapper(UserMapper.class).addUser(user);
        getSqlSession().getMapper(UserMapper.class).deleteUser(4);

        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
