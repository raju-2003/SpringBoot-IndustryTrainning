package com.example.springapp.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.Models.Book;


public interface BookRepo extends JpaRepository<Book, Integer> {
     
    
}
