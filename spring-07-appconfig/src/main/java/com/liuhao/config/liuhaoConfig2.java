package com.liuhao.config;

import com.liuhao.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//放在类上面，这个类就会被Spring托管，注册到容器中，因为它源码的实现就用到了@Component。
//@Configuration代表这是一个配置类，与beans.xml功能一样
@Configuration
@ComponentScan("com.liuhao.pojo")
@Import(liuhaoConfig.class)
public class liuhaoConfig2 {
    //注册一个bean，相当于xml中的一个bean标签
    //这个方法中的名字相当于bean标签中的id属性
    //这个方法的返回值相当于bean标签中的class属性
    @Bean
    public User getUser()
    {
        return new User();  // 就是要返回注入到bean的对象
    }
}
