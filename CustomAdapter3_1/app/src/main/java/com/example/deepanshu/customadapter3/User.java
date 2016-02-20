package com.example.deepanshu.customadapter3;
import java.io.Serializable;

public class User extends Object implements Serializable {
    private String name;
    private String address;
    private String contact;
    private String college;
    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setContact(String contact) { this.contact = contact; }
    public void setCollege(String college) { this.college = college; }

    public String getUserName() { return this.name; }
    public String getUserAddress() { return this.address; }
    public String getUserContact() { return this.contact; }
    public String getUserCollege() { return this.college; }
}