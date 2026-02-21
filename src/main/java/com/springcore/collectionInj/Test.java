package com.springcore.collectionInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args){
        ApplicationContext Context= new ClassPathXmlApplicationContext("contextCollectionInj.xml");

       Employee Emp1= (Employee) Context.getBean("Emp1");
        System.out.println(Emp1.getName());
        System.out.println(Emp1.getPhones());
        System.out.println(Emp1.getAddresses());
        System.out.println(Emp1.getCourses());
    }
}
