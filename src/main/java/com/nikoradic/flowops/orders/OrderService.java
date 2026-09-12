package com.nikoradic.flowops.orders;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public List<Order> getOrders() {
        return List.of(
                new Order(1, "John", "Laptop", 2, "CREATED"),
                new Order(2, "Anna", "Phone", 1, "VALIDATED"),
                new Order(3, "Mike", "Monitor", 3, "PROCESSING")
        );
    }

}
