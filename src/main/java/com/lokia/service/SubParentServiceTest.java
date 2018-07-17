package com.lokia.service;

import com.lokia.service.subparent.ParentService;
import com.lokia.service.subparent.SubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubParentServiceTest {

    @Autowired
    private ParentService parentService;

    public  void test(){
        parentService.test();
    }
}
