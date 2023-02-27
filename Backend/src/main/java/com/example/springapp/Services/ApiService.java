package com.example.springapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Worker;
import com.example.springapp.Repositories.WorkerRepo;
@Service
public class ApiService {
    
    @Autowired
    private WorkerRepo stu;

    //save details
    public Worker saveDetails(Worker s) {
        return stu.save(s);
    }   

    //get all details
    public List<Worker> getAllDetails() {
        return stu.findAll();
    }

    //get details by id
    public Worker getDetailsById(String id) {
        return stu.findById(id).orElse(null);
    }

    //delete details by id to details all details in that id
    public void deleteDetailsById(String id) {
        //try catch to caught exception
        try {
            stu.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    

    //update details by id
    public Worker updateDetails(String id, Worker s) {
        s.setid(id);
        return  stu.saveAndFlush(s);
    }



    

    
}
