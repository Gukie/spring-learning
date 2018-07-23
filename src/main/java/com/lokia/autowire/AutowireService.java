package com.lokia.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author gushu
 * @data 2018/7/20
 */
@Component
public class AutowireService {

//    @Autowired(required = false)
    private AutowireTestBean autowireTestBean;
    public AutowireTestBean getAutowireTestBean() {
        return autowireTestBean;
    }

//    @Required
    public void setAutowireTestBean(AutowireTestBean autowireTestBean) {
        this.autowireTestBean = autowireTestBean;
    }
}