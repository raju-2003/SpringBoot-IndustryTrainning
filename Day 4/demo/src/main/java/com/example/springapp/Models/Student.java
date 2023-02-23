package com.example.springapp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="ID")
    private int id;

    @Column(name="STUDENTNAME")
    private String name;
    
    @Column(name="DEPARTMENTNAME")
    private String deptname;

    //salary long
    @Column(name="MAILID")
    private String mailid;

    //constructor with no parameter
    public Student() {
    }
    
    //constructor with parameter 
    public Student(int id, String name, String deptname, String mailid) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.mailid = mailid;
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

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    
    // sql query for creating table employee
    // json data for postman
    
  
    
}
