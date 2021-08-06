package com.liuhao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2021/8/3
 */
//@Component 等价于<bean id="user" class="com.liuhao.pojo.User"></bean>
@Component
@Scope("singleton")
public class User {
    @Value("liuhao")
    private String name;

    public String getName() {
        return name;
    }
}
