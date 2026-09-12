package com.nikoradic.flowops.orders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OrderRepository orderRepository;

    public DataInitializer(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) {
        if (orderRepository.count() == 0) {
            orderRepository.saveAll(List.of(
                    new Order("John", "Laptop", 2, "CREATED"),
                    new Order("Anna", "Phone", 1, "VALIDATED"),
                    new Order("Mike", "Monitor", 3, "PROCESSING")
            ));
        }
    }

}
