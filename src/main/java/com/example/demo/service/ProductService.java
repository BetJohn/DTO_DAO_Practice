package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product getById(Integer id){
        return productRepository.getById(id);
    }
}
