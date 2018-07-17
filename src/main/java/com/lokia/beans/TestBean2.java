package com.lokia.beans;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;


@Data
public class TestBean2  implements BeanNameAware{
    private int age;
    private String name;
    private String desc;

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName:"+name);
    }
}
