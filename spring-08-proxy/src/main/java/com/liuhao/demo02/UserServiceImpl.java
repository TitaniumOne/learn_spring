package com.liuhao.demo02;

/**
 * Created by Administrator on 2021/8/3
 */
public class UserServiceImpl implements UserService{

    @Override
    public void add(){
        System.out.println("使用了add方法");
        System.out.println("增加一个用户");
    }

    @Override
    public void delete(){
        System.out.println("删除一个用户");
    }

    @Override
    public void update(){
        System.out.println("更新一个用户");
    }

    @Override
    public void query(){
        System.out.println("查询一个用户");
    }
}