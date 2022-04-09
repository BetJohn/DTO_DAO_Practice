package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Order;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class LoggingController {
    @Autowired
    @RequestMapping("/")
    public String index(){
        return "Hello there!";
    }
    @PostMapping("/register")
    public void registerCustomer(){
    }
    @PostMapping("/loggin")
    public void setLogger(){

    }

}
