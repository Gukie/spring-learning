package com.lokia.main;

import com.lokia.beans.TestBean1;
import com.lokia.service.BeanAnnotationTestService;
import com.lokia.service.methodinjection.ApplicationContextMIServiceTest;
import com.lokia.service.SubParentServiceTest;
import com.lokia.service.methodinjection.CglibLookupMIServiceTest;
import com.lokia.service.methodinjection.replace.ReplacementMIServiceTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class SprintTestMain {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println();
        Map<String,TestBean1> nameBeanMap = context.getBeansOfType(TestBean1.class);
        for(Map.Entry<String,TestBean1> entry: nameBeanMap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }

        System.out.println();
        System.out.println("TestBean1 instance primary name...");
        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1.getName());


        // test service invoke
        System.out.println();
        System.out.println("TestBean1 instance primary name...");
        BeanAnnotationTestService beanAnnotationTestService = context.getBean(BeanAnnotationTestService.class);
        beanAnnotationTestService.printBeanName();

        System.out.println();
        System.out.println("test sub-parent service definition...");
        SubParentServiceTest subParentServiceTest = context.getBean(SubParentServiceTest.class);
        subParentServiceTest.test();

//        method injection
        System.out.println();
        System.out.println("test method injection with applicationContext...");
        ApplicationContextMIServiceTest methodInjectionServiceTestApplicationContext = context.getBean(ApplicationContextMIServiceTest.class);
        for(int i =0;i<3;i++){
            methodInjectionServiceTestApplicationContext.testAutowire();
        }
        System.out.println("------------");
        for(int i =0;i<3;i++){
            methodInjectionServiceTestApplicationContext.testMethodInject();
        }

        System.out.println();
        System.out.println("test method injection with lookup...");
        CglibLookupMIServiceTest lookup = context.getBean(CglibLookupMIServiceTest.class);
        for(int i =0;i<3;i++){
            lookup.test();
        }

        System.out.println();
        System.out.println("test method injection with replacement...");
        ReplacementMIServiceTest replacement = context.getBean(ReplacementMIServiceTest.class);
        for(int i =0;i<3;i++){
            System.out.println(replacement.generateStr());
            Thread.sleep(2);
        }

    }
}
