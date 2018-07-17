package com.lokia.beans;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;


//@Data
public class TestBean2{
    private int age;
    private String name;
    private String desc;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
