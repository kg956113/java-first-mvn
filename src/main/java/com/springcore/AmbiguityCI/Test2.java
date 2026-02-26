package com.springcore.AmbiguityCI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("AmbiguityCI.xml");

       Addition add= (Addition) context.getBean("add");
       add.doSum();
    }
}
