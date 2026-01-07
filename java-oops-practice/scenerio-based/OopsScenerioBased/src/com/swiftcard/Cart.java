package com.swiftcard;
import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;  

    // Constructor: empty cart
    Cart() {
        products = new ArrayList<>();
    }

    // Constructor: pre-selected items
    Cart(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // Price calculation (private)
    private void calculateTotalPrice() {
        totalPrice = 0;
        for (Product p : products) {
            int quantity = 1; 
            totalPrice += p.price * quantity; 
        }
    }

    @Override
    public void applyDiscount(double couponAmount) {
        double discount = 0;

        // Polymorphic discount application
        for (Product p : products) {
            discount += p.price * p.getDiscountRate();
        }

        totalPrice = totalPrice - discount - couponAmount;
    }

    @Override
    public void generateBill() {
        calculateTotalPrice();
        applyDiscount(20); 
        System.out.println("Final Bill Amount: ₹" + totalPrice);
    }
}
