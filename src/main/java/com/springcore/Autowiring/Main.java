package com.springcore.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Autowiring.xml");

      Employee emp1= (Employee) context.getBean("emp1");
        System.out.println(emp1);
        System.out.println(emp1);
    }
}
