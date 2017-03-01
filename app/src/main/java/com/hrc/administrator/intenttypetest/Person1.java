package com.hrc.administrator.intenttypetest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/1.
 */

public class Person1 implements Serializable{
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
