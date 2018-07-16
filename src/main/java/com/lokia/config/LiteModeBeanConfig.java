package com.lokia.config;

import com.lokia.beans.TestBean1;
import com.lokia.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class LiteModeBeanConfig {
    @Order(1)
    @Bean("lite-TestBean1")
    @Primary
    public TestBean1 getTestBean1() {
        TestBean1 result = new TestBean1();
        result.setName("lite-TestBean1");

        TestBean2 testBean2 = getTestBean2();
        testBean2.setName("from getTestBean1 in lite");
        return result;
    }

    @Bean("lite-TestBean2")
    public TestBean2 getTestBean2() {
        return new TestBean2();
    }
}
