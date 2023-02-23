package com.example.springapp.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Employee;
import com.example.springapp.Services.ApiService;

@RestController
public class ApiController {
    @Autowired
    private ApiService stuServices;
    
    //get all details
    @GetMapping("/")
    public List<Employee> getAllDetails(){
        return stuServices.getAllDetails();
    }

    //post details
    @PostMapping("/")
    public Employee saveDetails(@RequestBody Employee s) {
        return stuServices.saveDetails(s);
    }

    // JSON query: {"id":1,"name":"John","age":20,"salary":10000}

    //get details by id using path variable
     @GetMapping("/{id}") 
        public Employee getDetailsById(@PathVariable int id) {
            return stuServices.getDetailsById(id);
        }
}   
