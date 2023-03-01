package com.example.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Customer;
import com.example.springapp.Services.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    //get all details
    @GetMapping("/customer")
    public List<Customer> getAllDetails() {
        return customerService.getAllDetails();
    }

    //get details by aadharid
    @GetMapping("/customer/{aadharid}")
    public Customer getDetailsByAadharid(@PathVariable String aadharid) {
        return customerService.getDetailsByAadharid(aadharid);
    }
    

    //post details
    @PostMapping("/customerpost")
    public Customer saveDetails(@RequestBody Customer customer) {
        return customerService.saveDetails(customer);
    }

    //get details by aadharid
    @PutMapping("/customer/{aadharid}")
    public Customer updateDetails(@PathVariable String aadharid, @RequestBody Customer customer) {
        return customerService.updateDetails(aadharid,customer);
    }

    //delete details by aadharid
    @DeleteMapping("/customerdelete/{aadharid}")
    public String deleteDetailsByAadharid(@PathVariable String aadharid) {
        return customerService.deleteDetailsByAadharid(aadharid);
    }

}

