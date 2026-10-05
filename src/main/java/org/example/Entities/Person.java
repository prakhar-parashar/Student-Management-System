package org.example.Entities;

import org.example.Components.Address;

public abstract class Person {
    private String Name;
    private String email;
    private String userName;
    private String password;
    private int age;
    private long mobileNo;
    private Address address;

    public Person(String name, String email, String userName, String password, int age, long mobileNo, Address address) {
        Name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public Person(String name, String userName, String password, int age, long mobileNo, Address address) {
        Name = name;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Name: " + Name +
                ", age:" + age +
                ", email: " + email +
                ", user name: " + userName +
                ", mobile number: " + mobileNo +
                ",\n" + address.toString() + "\n";
    }
}
