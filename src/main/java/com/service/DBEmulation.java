package com.service;

import com.models.Customer;
import com.models.Order;
import com.models.Product;

import java.time.LocalDate;
import java.util.*;

public class DBEmulation {
    public static void make() {
        Customer customer1 = new Customer((long) 1, "Nicholas", 1);
        Customer customer2 = new Customer((long) 2, "Petro", 2);
        Customer customer3 = new Customer((long) 3, "Anton", 2);
        Customer customer4 = new Customer((long) 4, "Ivan", 1);
        Customer customer5 = new Customer((long) 5, "Afanasiy", 3);

        Product product1 = new Product((long) 1, "Mouse", "Peripherials", 8);
        Product product2 = new Product((long) 2, "Keyboard", "Peripherials", 12);
        Product product3 = new Product((long) 3, "Sling", "Baby", 29);
        Product product4 = new Product((long) 4, "Lego", "Baby", 150);
        Product product5 = new Product((long) 5, "Socks", "Men", 6);
        Product product6 = new Product((long) 6, "Jeans", "Men", 82);
        Product product7 = new Product((long) 7, "Lipstick", "Women", 15);
        Product product8 = new Product((long) 8, "Bra", "Women", 102);

        Order order1 = new Order((long) 1, LocalDate.of(2020, 12, 30),
                LocalDate.of(2021, 1, 14), "pending", customer1);
        Order order2 = new Order((long) 2, LocalDate.of(2021, 3, 21),
                LocalDate.of(2021, 3, 23), "delivered", customer2);
        Order order3 = new Order((long) 3, LocalDate.of(2021, 3, 22),
                LocalDate.of(2021, 1, 14), "canceled", customer2);
        Order order4 = new Order((long) 4, LocalDate.of(2021, 10, 15),
                LocalDate.of(2021, 10, 17), "canceled", customer3);
        Order order5 = new Order((long) 5, LocalDate.of(2021, 10, 15),
                LocalDate.of(2021, 11, 5), "delivered", customer4);
        Order order6 = new Order((long) 6, LocalDate.of(2021, 11, 3),
                LocalDate.of(2021, 12, 25), "pending", customer5);

        Set<Product> productSet1 = new HashSet<>();
        Set<Product> productSet2 = new HashSet<>();
        Set<Product> productSet3 = new HashSet<>();
        Set<Order> orderSet1 = new HashSet<>();
        Set<Order> orderSet2 = new HashSet<>();
        Set<Order> orderSet3 = new HashSet<>();
        Set<Order> orderSet4 = new HashSet<>();

        productSet1.add(product1);
        productSet1.add(product3);
        productSet1.add(product5);
        productSet1.add(product8);
        productSet2.add(product2);
        productSet2.add(product4);
        productSet2.add(product8);
        productSet3.add(product6);
        productSet3.add(product7);
        productSet3.add(product8);
        orderSet1.add(order1);
        orderSet1.add(order3);
        orderSet1.add(order5);
        orderSet2.add(order6);
        orderSet3.add(order2);
        orderSet3.add(order4);
        orderSet4.add(order1);
        orderSet4.add(order2);
        orderSet4.add(order3);
        orderSet4.add(order4);
        orderSet4.add(order5);
        orderSet4.add(order6);
        product1.setOrders(orderSet1);
        product2.setOrders(orderSet1);
        product3.setOrders(orderSet2);
        product4.setOrders(orderSet2);
        product5.setOrders(orderSet3);
        product6.setOrders(orderSet4);
        order1.setProducts(productSet1);
        order2.setProducts(productSet1);
        order3.setProducts(productSet2);
        order4.setProducts(productSet2);
        order5.setProducts(productSet3);
        order6.setProducts(productSet3);
    }
}
