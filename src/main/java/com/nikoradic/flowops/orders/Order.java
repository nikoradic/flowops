package com.nikoradic.flowops.orders;

public class Order {

    private long id;
    private String customer;
    private String product;
    private int quantity;
    private String status;

    public Order(long id, String customer, String product, int quantity, String status) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
    }

    public long getId() {
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
