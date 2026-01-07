package com.swiftcard;
import java.util.*;

public class SwiftCartApp {
    public static void main(String[] args) {

        Product p1 = new PerishableProduct("Milk", 400);
        Product p2 = new NonPerishableProduct("Rice", 550);
        Product p3 = new PerishableProduct("Vegetables", 800);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.generateBill();
    }
}
