package com.lokia.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gushu
 * @data 2018/7/24
 */
public class BlackEventMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.lokia.event");
        context.refresh();

        BlackListEventPublisher eventPublisher = context.getBean(BlackListEventPublisher.class);
        for (int i = 0; i < 3; i++) {
            eventPublisher.publishBlackItem("" + i);
        }
    }
}
