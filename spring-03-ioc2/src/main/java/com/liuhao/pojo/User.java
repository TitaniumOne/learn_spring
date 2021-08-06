package com.liuhao.pojo;

/**
 * Created by Administrator on 2021/8/2
 */
public class User {
    private String name;

    public User()
    {
        System.out.println("User的无参构造");
    }

    public User(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("调用set方法");
        this.name = name;
    }

    public void show(){
        System.out.println("name=" + name);
    }
}
