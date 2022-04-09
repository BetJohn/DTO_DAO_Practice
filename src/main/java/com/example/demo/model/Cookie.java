package com.example.demo.model;

import org.apache.coyote.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;

public class Cookie {
    ResponseCookie springCookie = ResponseCookie.from("user-id","1")
            .httpOnly(true)
            .secure(true)
            .path("/")
            .maxAge(60)
            .domain("mySite.com")
            .build();

    public Cookie(ResponseCookie springCookie, ResponseEntity responseEntity, ResponseCookie deleteSpringCookie, ResponseEntity deleteEntity) {
        this.springCookie = springCookie;
        this.responseEntity = responseEntity;
        this.deleteSpringCookie = deleteSpringCookie;
        this.deleteEntity = deleteEntity;
    }

    ResponseEntity responseEntity = ResponseEntity
                .ok()
                .header(HttpHeaders.SET_COOKIE, springCookie.toString())
                .build();
    ResponseCookie deleteSpringCookie = ResponseCookie.from("user-id", "1").maxAge(0).build();
    ResponseEntity deleteEntity = ResponseEntity
                .ok()
                .header(HttpHeaders.SET_COOKIE,deleteSpringCookie.toString())
                .build();
}
