package com.liuhao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2021/8/3
 */
public class People {
//    @Resource //java自带 先byName，再byType

    @Autowired  //spring byType
//    @Qualifier(value = "dog11") //若Autowired不能明确指代，则用Qualifier指代
    private Dog dog;


//    @Resource //java自带

    @Autowired
    @Qualifier(value = "cat22")
    private Cat cat;

    private String name;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog getDog() {
        return dog;
    }

//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
