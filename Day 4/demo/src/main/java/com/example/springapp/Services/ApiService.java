package com.example.springapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Student;
import com.example.springapp.Repositories.StudentRepo;
@Service
public class ApiService {
    
    @Autowired
    private StudentRepo stu;

    //save details
    public Student saveDetails(Student s) {
        return stu.save(s);
    }   

    //get all details
    public List<Student> getAllDetails() {
        return stu.findAll();
    }

    //get details by id
    public Student getDetailsById(int id) {
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
    public Student updateDetails(int id, Student s) {
        Student stu1 = stu.findById(id).orElse(null);
        stu1.setName(s.getName());
        stu1.setDeptname(s.getDeptname());
        stu1.setMailid(s.getMailid());
        return stu.save(stu1);
    }



    

    
}
