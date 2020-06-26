package com.jpassion.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    private String name = "Sang Shin";
    private int age = 77;

    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String retrievePersonInfo() {
        return getName() + " " + address.retrieveAddressInfo();
    }

}
