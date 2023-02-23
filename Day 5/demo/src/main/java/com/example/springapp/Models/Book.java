package com.example.springapp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="ID")
    private int id;

    @Column(name="BOOKNAME")
    private String name;
    
    @Column(name="PRICE")
    private float price;
    
    @Column(name="QUANTITY")
    private int quantity;
    
    @Column(name="AUTHORNAME")
    private String deptname;

    //constructor with no parameter
    public Book() {
    }
    
    //constructor with parameter
    public Book(int id, String name, float price, int quantity, String deptname) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.deptname = deptname;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   // getter and setter for authorname
    public String getauthorname() {
        return deptname;
    }

    public void setauthorname(String deptname) {
        this.deptname = deptname;
    }
    



    
    // sql query for creating table book
    
    // json data for postman
    
  
    // JSON data for postman
        
    
}
