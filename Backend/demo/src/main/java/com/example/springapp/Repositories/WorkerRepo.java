package com.example.springapp.Repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.Models.Worker;

import jakarta.transaction.Transactional;


public interface WorkerRepo extends JpaRepository<Worker, String> {

    Worker findByBusiness(String business);

    Worker findByAddress(String address);


    Worker deleteByName(String name);

    List<Worker> findByName(String business);

    @Query("SELECT w FROM Worker w WHERE w.address = ?1 AND w.business = ?2")
    List<Worker> findAll(String address, String business);

    //delete query
    @Modifying
    @Query("DELETE FROM Worker w WHERE w.name = ?1")
    void deleteById(String nmae);

    
    //update query
    @Modifying
    @Transactional
    @Query("UPDATE Worker w SET w.address = ?2, w.business = ?3 WHERE w.name = ?1")
    void updateByName(String name, String address, String business);


    //startwith query
    @Modifying
    @Transactional
    @Query("SELECT w FROM Worker w WHERE w.name LIKE ?1%")
    List<Worker> findAll(String name);

    
}



