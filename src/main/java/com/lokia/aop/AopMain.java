package com.lokia.aop;

import com.lokia.aop.cglib.CglibProxyServiceImpl;
import com.lokia.aop.jdk.JdkDynamicProxyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gushu
 * @data 2018/7/23
 */
public class AopMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // cglib
        System.out.println();
        CglibProxyServiceImpl cglibProxyService = applicationContext.getBean(CglibProxyServiceImpl.class);
        cglibProxyService.test();

        // jdk
        System.out.println();
        JdkDynamicProxyService jdkDynamicProxyService = applicationContext.getBean(JdkDynamicProxyService.class);
        jdkDynamicProxyService.test();
    }
}
