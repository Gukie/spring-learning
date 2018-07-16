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
        // // 这个阶段的 setName 方法的调用会被 AOP拦截，因为此时 TestBean2 已经在 Spring 容器中了
        testBean2.setName("dd");
        return result;
    }

    @Bean("full-TestBean2")
    public TestBean2 getTestBean2(){
        TestBean2 result = new TestBean2();
        // 这个阶段的 setName 方法的调用不会被 AOP拦截，因为此时 TestBean2 还没有放到 Spring 容器中
        result.setName("full-TestBean2");
        return result;
    }
}
