package com.mutilevelinheritence;

public class DeliveredOrder extends ShippedOrder {
	
	//Declaring the variables
    String deliveryDate;

    
    //Constructors
    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}
