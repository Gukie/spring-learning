package com.lokia.main;

import com.lokia.beans.TestBean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class SprintTestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Map<String,TestBean1> nameBeanMap = context.getBeansOfType(TestBean1.class);
        for(Map.Entry<String,TestBean1> entry: nameBeanMap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }

        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1.getName());
    }
}
