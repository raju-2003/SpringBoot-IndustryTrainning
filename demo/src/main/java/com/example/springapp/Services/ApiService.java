package com.example.springapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Employee;
import com.example.springapp.Repositories.EmployeeRepo;
@Service
public class ApiService {
    
    @Autowired
    private EmployeeRepo stu;

    //save details
    public Employee saveDetails(Employee s) {
        return stu.save(s);
    }   

    //get all details
    public List<Employee> getAllDetails() {
        return stu.findAll();
    }

    //get details by id
    public Employee getDetailsById(int id) {
        return stu.findById(id).orElse(null);
    }

    
}
