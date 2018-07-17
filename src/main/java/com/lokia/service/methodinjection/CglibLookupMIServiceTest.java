package com.lokia.service.methodinjection;

import com.lokia.beans.SingletonBean;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public abstract class CglibLookupMIServiceTest {

    public void test(){
        SingletonBean singletonBean = getSingletonBean();
        System.out.println(singletonBean);
        System.out.println("name:"+singletonBean.getName());
        singletonBean.setName(""+System.currentTimeMillis());
    }

    @Lookup
    protected abstract SingletonBean getSingletonBean();


//    @Lookup
//    protected SingletonBean getSingletonBean(){
//        return null;
//    }

}
