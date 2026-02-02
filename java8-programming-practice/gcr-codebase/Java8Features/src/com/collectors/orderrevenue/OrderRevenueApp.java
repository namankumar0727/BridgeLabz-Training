package com.collectors.orderrevenue;
import java.util.*;
import java.util.stream.*;

public class OrderRevenueApp {
    public static void main(String[] args) {

        List<Order> orders = List.of(
            new Order("Alice", 2500.00),
            new Order("Bob", 1800.50),
            new Order("Alice", 3200.75),
            new Order("Charlie", 1500.00),
            new Order("Bob", 2200.25)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
                                               .collect(Collectors.groupingBy(Order::getCustomerName,
                                               Collectors.summingDouble(Order::getOrderTotal)));

        revenueByCustomer.forEach((customer, total) ->
            System.out.println(customer + " Total Revenue: " + total)
        );
    }
}
