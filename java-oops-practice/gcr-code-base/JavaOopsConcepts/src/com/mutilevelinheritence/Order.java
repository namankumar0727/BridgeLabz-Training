package com.mutilevelinheritence;

public class Order {
	
	//Declaring the variables
    int orderId;
    String orderDate;

    //Constructors
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}
