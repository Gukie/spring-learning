package com.lokia.config;

import com.lokia.service.beaninterface.TransferService;
import com.lokia.service.beaninterface.impl.TransferServiceImpl;
import com.lokia.service.beaninterface.impl.TransferServiceImpl2;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanAnnotationInterfaceConfig {

    @Bean
    public TransferService getTransferService2(){
        return new TransferServiceImpl2();
    }

    @Bean
    public TransferService getTransferService(){
        TransferServiceImpl result = new TransferServiceImpl();
        result.setName("from interface ");
        return result;
    }

    // generate bean by impl
    @Bean
    public TransferServiceImpl getTransferServiceImpl(){
        TransferServiceImpl result = new TransferServiceImpl();
        result.setName("from impl ");
        return result;
    }
}
