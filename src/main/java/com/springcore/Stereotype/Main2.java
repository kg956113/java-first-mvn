package com.springcore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("stereotype.xml");
         Student student= (Student) context.getBean("Ob");
        System.out.println(student);
        System.out.println(student.getAddress());
    }
}
