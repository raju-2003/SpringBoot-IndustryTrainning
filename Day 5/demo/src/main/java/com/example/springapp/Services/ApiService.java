package com.example.springapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Book;
import com.example.springapp.Repositories.BookRepo;
@Service
public class ApiService {
    
    @Autowired
    private BookRepo stu;

    //save details
    public Book saveDetails(Book s) {
        return stu.save(s);
    }   

    //get all details
    public List<Book> getAllDetails() {
        return stu.findAll();
    }

    //get details by id
    public Book getDetailsById(int id) {
        return stu.findById(id).orElse(null);
    }

    //delete details by id to details all details in that id
    public void deleteDetailsById(int id) {
        //try catch to caught exception
        try {
            stu.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    

    //update details by id
    public Book updateDetails(int id, Book s) {
        Book stu1 = stu.findById(id).orElse(null);
        stu1.setName(s.getName());
        stu1.setPrice(s.getPrice());
        stu1.setQuantity(s.getQuantity());
        stu1.setauthorname(s.getauthorname());
        return stu.save(stu1);
    }



    

    
}
