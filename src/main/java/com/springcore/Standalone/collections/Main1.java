package com.springcore.Standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("standaloneCollections.xml");
       Person person1= (Person) context.getBean("person1");
        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());
        System.out.println("---------------------------------");
        System.out.println(person1.getFeestructure());
        System.out.println("----------------------------------");
        System.out.println(person1.getProperties());
    }
}
