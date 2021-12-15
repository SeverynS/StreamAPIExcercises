package com.models;

import java.time.LocalDate;
import java.util.Set;

public class Order {
    private Long id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private Customer customer;
    Set<Product> products;

    public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = customer;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
