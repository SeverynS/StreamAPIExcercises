package com.models;

import java.util.Set;

public class Product {
    private Long id;
    private String name;
    private String category;
    private int price;
    private Set<Order> orders;

    public Product(Long id, String name, String category, int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
