package com.foodloop;
import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {

    private List<FoodItem> items;
    protected double total;

    // Default constructor
    Order() {
        items = new ArrayList<>();
        total = 0;
    }

    // Constructor for combo meals
    Order(List<FoodItem> comboItems) {
        this();
        for (FoodItem item : comboItems) {
            addItem(item);
        }
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            total += item.getPrice();   // operator usage
            item.reduceStock();
        }
    }

    protected double applyDiscount() {
        if (total >= 500) {
            return total * 0.20;  // 20% discount
        } else if (total >= 300) {
            return total * 0.10;  // 10% discount
        }
        return 0;
    }

    @Override
    public void placeOrder() {
        double discount = applyDiscount();
        total = total - discount;
        System.out.println("Order placed. Final Amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled.");
    }
}
