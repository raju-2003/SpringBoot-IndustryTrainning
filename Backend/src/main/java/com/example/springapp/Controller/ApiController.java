package com.example.springapp.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Worker;
import com.example.springapp.Services.ApiService;

@RestController
public class ApiController {
    @Autowired
    private ApiService stuServices;
    
    //get all details
    @GetMapping("/")
    public List<Worker> getAllDetails(){
        return stuServices.getAllDetails();
    }

    //post details
    @PostMapping("/")
    public Worker saveDetails(@RequestBody Worker s) {
        return stuServices.saveDetails(s);
    }

    // JSON query: {"id":1,"name":"John","age":20,"salary":10000}

    //get details by id using path variable
    @GetMapping("/{id}") 
        public Worker getDetailsById(@PathVariable String id) {
            return stuServices.getDetailsById(id);
        }
    
    //print hello using get mapping
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
    



    // put mapping method to update  all details by using id
    @PutMapping("/{id}")
    public Worker updateDetails(@PathVariable String id, @RequestBody Worker s) {
        return stuServices.updateDetails(id, s);
    }

    //delete mapping method to delete all details by using id
    @DeleteMapping("/{id}")
    public void deleteDetailsById(@PathVariable String id) {
        stuServices.deleteDetailsById(id);
    }

    
}   


