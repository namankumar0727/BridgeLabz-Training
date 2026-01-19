package com.smartchekout;
import java.util.List;

class Customer {
    private String name;
    private List<String> items;

    public Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<String> getItems() {
        return items;
    }
}
