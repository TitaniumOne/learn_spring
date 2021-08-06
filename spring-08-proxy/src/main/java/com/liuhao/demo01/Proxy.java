package com.liuhao.demo01;

/**
 * Created by Administrator on 2021/8/3
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent()
    {
        host.rent();
        seeHouse();
        fare();
        contrast();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fare(){
        System.out.println("收中介费");
    }

    public void contrast(){
        System.out.println("签合同");
    }

}
