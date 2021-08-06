package com.liuhao.demo03;

/**
 * Created by Administrator on 2021/8/4
 */
public class Client {
    public static void main(String[] args) {

    //真实角色
    Host host = new Host();

    //代理角色
    ProxyInvocationHandler pih = new ProxyInvocationHandler();

    //通过程序调用处理角色，来处理我们要调用的接口对象
    pih.setRent(host);

    Rent proxy = (Rent) pih.getProxy();  //Proxy是动态生成的，并没有写

    proxy.rent();

    }
}
