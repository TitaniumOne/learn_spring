package com.liuhao.mapper;

import com.liuhao.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * Created by Administrator on 2021/8/5
 */
public class UserMapperImpl implements UserMapper{

    //以前，所有的操作都使用sqlSession来执行。现在都使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

}
