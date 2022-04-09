package com.example.demo.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

@Entity
@EnableAutoConfiguration
@Table(name = "products")
public class Product {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product(Integer id, int price, Order order) {
        this.id = id;
        this.price = price;
        this.order = order;
    }

    @Id
    @GeneratedValue
    private Integer id;
    private int price;
    @ManyToOne
    Order order;
}
