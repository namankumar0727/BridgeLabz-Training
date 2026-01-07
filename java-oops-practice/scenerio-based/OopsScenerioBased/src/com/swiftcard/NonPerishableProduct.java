package com.swiftcard;
class NonPerishableProduct extends Product {

    NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }
 // 5% discount

    @Override
    double getDiscountRate() {
        return 0.05;     }
}
