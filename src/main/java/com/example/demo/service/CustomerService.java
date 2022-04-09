package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public Optional<Customer> getById(Integer id){
        return customerRepository.findById(id);
    }
    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }
    public Customer getByUsername(String username){
        return customerRepository.getByUsername(username);
    }
}
