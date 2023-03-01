package com.example.springapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Customer;
import com.example.springapp.Repositories.CustomerRepo;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepository;

    //save details
    public Customer saveDetails(Customer customer) {
        return customerRepository.save(customer);
    }

    //get all details
    public List<Customer> getAllDetails() {
        return customerRepository.findAll();
    }

    //get details by aadharid
    public Customer getDetailsByAadharid(String aadharid) {
        return customerRepository.findById(aadharid).orElse(null);
    }

    //delete details by aadharid
    public String deleteDetailsByAadharid(String aadharid) {
        try{
            customerRepository.deleteById(aadharid);
            return "Details deleted " ;
        }
        catch(Exception e){
            return "Details not found " ;
        }
    }

    //update details by aadharid
    public Customer updateDetails(String aadharid, Customer s) {
        s.setAadharid(aadharid);
        return  customerRepository.saveAndFlush(s);
    }




    
}
