package com.example.springapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.Models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String>{
    
}
