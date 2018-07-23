package com.lokia.annotation;

import com.lokia.annotation.service.AnnotationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gushu
 * @data 2018/7/23
 */
public class AnnotationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AnnotationConfig.class);
        context.refresh();


        String beanNames[] =context.getBeanNamesForType(AnnotationService.class);
        for(String beanName: beanNames){
            System.out.println(beanName);
        }
    }
}
