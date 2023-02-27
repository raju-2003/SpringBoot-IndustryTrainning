package com.example.springapp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="WORKER")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private String id;

    @Column(name="NAME")
    private String name;
    
    @Column(name="EMAIL")
    private String email;
    
    @Column(name="PHONE")
    private String phone;
    
    @Column(name="ADDRESS")
    private String address;

    @Column(name="BUSINESS")
    private String business;

    //constructor with no parameter
    public Worker() {
    }
    
    //constructor with parameter
    public Worker(String id, String name, String email, String phone, String address, String business) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.business = business;
    }

    //getters and setters
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
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
    
    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }
    // sql query for creating table worker for sql client

    // CREATE TABLE `WORKER` (
    
    //   PRIMARY KEY (`ID`)

    
    // json data for postman

   
  
    // JSON data for postman
        
    
}
