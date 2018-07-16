package com.lokia.config;

import com.lokia.beans.TestBean1;
import com.lokia.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Configuration
public class LiteModeBeanConfig {
    @Order(1)
    @Bean(value = "lite-TestBean1")
    @Primary
    public TestBean1 getTestBean1() {
        TestBean1 result = new TestBean1();
        result.setName("lite-TestBean1");
        TestBean2 testBean2 = getTestBean2();
        // 这里将不会被AOP代理，因为 当前是lite 模式
        testBean2.getAge();
        return result;
    }

    @Bean("lite-TestBean2")
    public TestBean2 getTestBean2() {
        TestBean2 result = new TestBean2();
        result.setName("lite-TestBean2");
        return result;
    }
}
