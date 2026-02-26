package com.springcore.autowiringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("AutoAnnotations.xml");
//        AbstractApplicationContext
//                context = new ClassPathXmlApplicationContext("AutoAnnotations.xml");
//        context.registerShutdownHook();


     Employee emp= (Employee) context.getBean("emp1");
        System.out.println(emp);
    }
}
