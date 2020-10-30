package com.example.krasnoyarsk_region_forest.Models;

public class User {
    private String email, name, pass, phone;
    public User() {}
    public User(String email, String name, String pass, String phone) {
        this.name = email;
        this.name = name;
        this.name = pass;
        this.name = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
