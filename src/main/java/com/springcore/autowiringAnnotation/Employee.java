package com.springcore.autowiringAnnotation;


import org.springframework.beans.factory.annotation.Autowired;
public class Employee {
   // @Autowired   It worked
    private Address address;
//    public Employee(com.springcore.Autowiring.Address address) {
//        System.out.println("Setting value1");
//        this.address = address;
//    }
    public Employee(){
        super();
    }

    public Address getAddress() {
        return address;
    }
    @Autowired
    public void setAddress(Address address) {
        System.out.println("Setting value");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
