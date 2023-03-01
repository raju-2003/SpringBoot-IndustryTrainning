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
     
    //get all details using paging
    @GetMapping("/page/{page}/{size}")
    public List<Worker> page(@PathVariable int page, @PathVariable int size){
        return stuServices.page(page, size);
    }




    //post details
    @PostMapping("/")
    public Worker save(@RequestBody Worker s) {
        return stuServices.save(s);
    }

    

    // JSON query: {"id":1,"name":"John","age":20,"salary":10000}

    //get details by id using path variable
   
    
    //print hello using get mapping

    //get details by name using path variable by sorting
    
    
    //get details by business name
    @GetMapping("/business/{business}")
    public Worker getDetailsByBusinessWorker(@PathVariable String business) {
        return stuServices.getDetailsByBusiness(business);
    }
   
    @GetMapping("/id/{id}")
    public Worker getDetailsById(@PathVariable String id) {
        return stuServices.getDetailsById(id);
    }
    
    @GetMapping("/address/{address}")
    public Worker getDetailsByAddress(@PathVariable String address) {
        return stuServices.getDetailsByAddress(address);
    }
    // put mapping method to update  all details by using id
    @PutMapping("/{id}")
    public Worker updateDetails(@PathVariable String id, @RequestBody Worker s) {
        return stuServices.updateDetails(id, s);
    }
    
    //delete mapping method to delete all details by using id
    @DeleteMapping("/deleteby/{id}")
    public String deleteDetailsById(@PathVariable String id) {
        stuServices.deleteDetailsById(id);
        return "Deleted";
        
    }
    
    @GetMapping("/businesssorting/{business}")
    public List<Worker> getDetailsByName(@PathVariable String business) {
        //return results by Sort
        List<Worker> allProducts = stuServices.findProductWithSorting(business);
        return allProducts;
    }
    
    //delete
    @DeleteMapping("/delete/{name}")
    public String deleteDetailsByname(@PathVariable String name) {
        stuServices.deleteDetailsById(name);
        return "Deleted";
        
    }
     
    //update
    @PutMapping("/update/{name}/{address}/{business}")
    public String updateDetails(@PathVariable String name, @PathVariable String address, @PathVariable String business) {
        return stuServices.updateDetails(name, address, business);
    }


    @GetMapping("/getworkers/{business}/{address}")
    public List<Worker> getDetails(@PathVariable String business, @PathVariable String address){
        List<Worker> all = stuServices.findWorkers(address, business);
        return all;
    }

    //find by name
    @GetMapping("/getworkers/{name}")
    public List<Worker> getDetails(@PathVariable String name){
        List<Worker> all = stuServices.findWorkers(name);
        return all;
    }
}   


