package com.example.springapp.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.Models.Worker;


public interface WorkerRepo extends JpaRepository<Worker, String> {
     
    
}

// json for postman for worker table

// sql query to create table in mysql database

