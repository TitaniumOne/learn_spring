package com.liuhao.diy;

/**
 * Created by Administrator on 2021/8/4
 */
public class DiyPointCut {
    public void before(){
        System.out.println("======方法执行前======");
    }

    public void after(){
        System.out.println("===方法执行后===");
    }
}
