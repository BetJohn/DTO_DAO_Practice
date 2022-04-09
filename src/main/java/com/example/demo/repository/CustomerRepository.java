package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository <Customer, Integer>{
    public Customer getById(Integer Id);
    public Customer getByUsername(String username);
}
