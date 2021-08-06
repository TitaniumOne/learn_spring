package com.liuhao.demo04;

import com.liuhao.demo02.UserService;
import com.liuhao.demo02.UserServiceImpl;
import com.liuhao.demo02.UserServiceImpl2;

/**
 * Created by Administrator on 2021/8/4
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImpl();
        //两个类实现了同一个接口，只需要在设置代理类的时候修改即可
        UserService userService2 = new UserServiceImpl2();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService2);

        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();  //调用invoke方法
    }
}
