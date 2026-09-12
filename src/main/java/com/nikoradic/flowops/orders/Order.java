package com.nikoradic.flowops.orders;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    private String customer;
    private String product;
    private int quantity;
    private String status;

    public Order() {
    }

    public Order(Long id, String customer, String product, int quantity, String status) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
    }

    public Order(String customer, String product, int quantity, String status) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

}
