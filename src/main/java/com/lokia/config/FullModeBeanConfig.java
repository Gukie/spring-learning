package com.lokia.config;

import com.lokia.beans.TestBean1;
import com.lokia.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class FullModeBeanConfig {


    @Order(2)
    @Bean("full-TestBean1")
    public TestBean1 getTestBean1(){
        TestBean1 result = new TestBean1();
        result.setName("full-TestBean1");

        TestBean2 testBean2 = getTestBean2();
        testBean2.setName("from getTestBean1 in full");

        return result;
    }

    @Bean("full-TestBean2")
    public TestBean2 getTestBean2(){
        return new TestBean2();
    }
}
