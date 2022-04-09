package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String password;
    private String username;
    private String city;
    private String country;
    @OneToMany
    private List<Order> orders;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Customer(Integer id, String username,String password, String city, String country, List<Order> orders) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.city = city;
        this.country = country;
        this.orders = orders;
    }
}
