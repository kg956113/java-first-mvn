package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("contextCI.xml");

       Person p= (Person) context.getBean("Person");
        System.out.println(p);

    }
}
