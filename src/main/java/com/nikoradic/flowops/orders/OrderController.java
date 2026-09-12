package com.nikoradic.flowops.orders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    public List<Order> getOrders() {
        return List.of(
                new Order(1, "John", "Laptop", 2, "CREATED"),
                new Order(2, "Anna", "Phone", 1, "VALIDATED"),
                new Order(3, "Mike", "Monitor", 3, "PROCESSING")
        );
    }

}

