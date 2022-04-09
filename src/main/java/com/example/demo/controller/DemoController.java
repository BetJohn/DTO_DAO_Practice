package com.example.demo.controller;

import com.example.demo.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

//    @GetMapping("/view")
//    public ModelAndView allCustomersView(){
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer(1,"BestJohn","Bucharest","Romania"));
//        customers.add(new Customer(2,"BestTrainerRusuDinu","Bucharest","Romania"));
//        customers.add(new Customer(3,"BestTrainerAlexHang","Bucharest","Romania"));
//        ModelAndView modelAndView = new ModelAndView("view-page");
//        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }
}
