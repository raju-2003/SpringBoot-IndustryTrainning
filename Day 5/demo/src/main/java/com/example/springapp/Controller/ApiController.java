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

import com.example.springapp.Models.Book;
import com.example.springapp.Services.ApiService;

@RestController
public class ApiController {
    @Autowired
    private ApiService stuServices;
    
    //get all details
    @GetMapping("/")
    public List<Book> getAllDetails(){
        return stuServices.getAllDetails();
    }

    //post details
    @PostMapping("/")
    public Book saveDetails(@RequestBody Book s) {
        return stuServices.saveDetails(s);
    }

    // JSON query: {"id":1,"name":"John","age":20,"salary":10000}

    //get details by id using path variable
    @GetMapping("/{id}") 
        public Book getDetailsById(@PathVariable int id) {
            return stuServices.getDetailsById(id);
        }
    

    // put mapping method to update  all details by using id
    @PutMapping("/{id}")
    public Book updateDetails(@PathVariable int id, @RequestBody Book s) {
        return stuServices.updateDetails(id, s);
    }

    //delete mapping method to delete all details by using id
    @DeleteMapping("/{id}")
    public void deleteDetailsById(@PathVariable int id) {
        stuServices.deleteDetailsById(id);
    }

    
}   


