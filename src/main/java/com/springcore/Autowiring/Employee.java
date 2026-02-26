package com.springcore.Autowiring;

public class Employee {
    private Address address;

    public Employee(Address address) {
        System.out.println("Setting value1");
        this.address = address;
    }
    public Employee(){
        super();
    }

    public Address getAddress() {
        return address;
    }

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
