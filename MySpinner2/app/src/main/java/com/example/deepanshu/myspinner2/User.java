package com.example.deepanshu.myspinner2;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String college;
    private String contact;
    private String address;
    public User(String name, String college, String contact, String address) {
        this.name = name;
        this.college = college;
        this.contact = contact;
        this.address = address;
    }
    public String getName() { return this.name; }
    public String getCollege() { return this.college; }
    public String getContact() { return this.contact; }
    public String getAddress() { return this.address; }
}