package com.foodloop;
class FoodItem {
    protected String name;
    protected String category;
    protected double price;
    protected boolean availability;
    private int stockLevel;   // encapsulated (hidden)

    FoodItem(String name, String category, double price, int stockLevel) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockLevel = stockLevel;
        this.availability = stockLevel > 0;
    }

    public boolean isAvailable() {
        return availability;
    }

    protected void reduceStock() {
        if (stockLevel > 0) {
            stockLevel--;
            availability = stockLevel > 0;
        }
    }

    public double getPrice() {
        return price;
    }
}
