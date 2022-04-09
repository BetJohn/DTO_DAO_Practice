package com.example.demo.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieController {
    @GetMapping("/cookie")
    public String readCoockie(
         @CookieValue(name = "user-id",defaultValue = "default")String userId){
        return userId;
    }

}
