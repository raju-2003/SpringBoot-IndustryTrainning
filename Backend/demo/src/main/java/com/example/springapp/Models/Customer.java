package com.example.springapp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id

    // aadharid, name, email, phone, address are the attributes of the customer
    @Column(name = "aadharid")
    private String aadharid;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    //empty constructor
    public Customer() {
    }

    //parameterized constructor
    public Customer(String aadharid, String name, String email, String phone, String address) {
        this.aadharid = aadharid;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    //getters and setters
    public String getAadharid() {
        return aadharid;
    }

    public void setAadharid(String aadharid) {
        this.aadharid = aadharid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //sql query to create table to customer
    //json data to be inserted in postman
    
}
