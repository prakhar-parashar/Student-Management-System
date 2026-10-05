package org.example.Entities;

import org.example.Components.Address;

public class Faculty extends Person{
    private String department;
    private final String role;

    public Faculty(String name, String email, String userName, String password, int age, long mobileNo, Address address, String department, String role) {
        super(name, email, userName, password, age, mobileNo, address);
        this.department = department;
        this.role = role;
    }

    public Faculty(String name, String userName, String password, int age, long mobileNo, Address address, String department, String role) {
        super(name, userName, password, age, mobileNo, address);
        this.department = department;
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Department: " + department +
                ", Role: " + role + "\n";
    }
}
