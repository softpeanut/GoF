package com.example.designpatterns._01_credentialpatterns._03_abstractfactory.java;

import com.example.designpatterns._01_credentialpatterns._02_factorymethod.after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship bean = applicationContext.getBean("whiteShip", Ship.class);
        System.out.println(bean.getName());

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
//        Ship bean = applicationContext.getBean(Ship.class);
//        System.out.println(bean.getName());
    }
}
