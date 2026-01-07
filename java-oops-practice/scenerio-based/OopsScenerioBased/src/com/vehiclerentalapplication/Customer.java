package com.vehiclerentalapplication;

public class Customer {

	//Declaration
    private String customerName;
    private String customerId;

    //Constructor
    Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }
}
