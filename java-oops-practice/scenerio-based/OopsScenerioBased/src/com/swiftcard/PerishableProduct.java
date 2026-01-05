package com.swiftcard;

class PerishableProduct extends Product {

    PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    // 10% discount
    @Override
    double getDiscountRate() {
        return 0.10; 
    }
}
