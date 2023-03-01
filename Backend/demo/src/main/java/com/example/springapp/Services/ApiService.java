package com.example.springapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Worker;
import com.example.springapp.Repositories.WorkerRepo;

//import page request
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class ApiService {
    
    @Autowired
    private WorkerRepo stu;

    //save details
    public Worker save(Worker s) {
        return stu.save(s);
    }   

    //get all details
    public List<Worker> getAllDetails() {
        return stu.findAll();
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
    
    //worker can update all details by using id
    public Worker updateDetails(String id, Worker s) {
        s.setid(id);
        return  stu.saveAndFlush(s);
    }
    
    
    
    //get details by id of the worker
    public Worker getDetailsById(String id) {
        return stu.findById(id).orElse(null);
    }
    //user can search for worker by business name
    public Worker getDetailsByBusiness(String business) {
        return stu.findByBusiness(business);
        
    }
    
    //user can search for worker by address
    public Worker getDetailsByAddress(String address) {
        return stu.findByAddress(address);
    }

   

    public List<Worker> findProductWithSorting(String business) {
        return stu.findAll(Sort.by(Sort.Direction.ASC, "business"));

    }
     
    public List<Worker> findWorkers(String address, String business){
        return stu.findAll(address,business);
    }

    //delete
    public void deleteDetails(String id) {
        stu.deleteById(id);
    }

    //update

    public String updateDetails(String name, String address, String business) {
        stu.updateByName(name, address, business);
        return "updated";
    }

    //page 
    public List<Worker> page(int page, int size) {
        Pageable paging = PageRequest.of(page, size);
        Page<Worker> pagedResult = stu.findAll(paging);
        return pagedResult.toList();
    }

    public List<Worker> findWorkers(String name) {
        return stu.findAll(name);
    }
    
    

    
}
