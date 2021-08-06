package com.liuhao.mapper;

import com.liuhao.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by Administrator on 2021/8/5
 */
public class UserMapperImplTwo extends SqlSessionDaoSupport implements UserMapper{

//    //以前，所有的操作都使用sqlSession来执行。现在都使用sqlSessionTemplate
//    private SqlSessionTemplate sqlSession;
//
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }

    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
