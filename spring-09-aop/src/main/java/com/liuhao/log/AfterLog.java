package com.liuhao.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2021/8/4
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue 返回结果
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("被执行了" + method.getName() + "方法，返回结果为" + returnValue);

    }
}
