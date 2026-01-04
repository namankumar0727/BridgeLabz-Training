package com.hospitalpatientanagementsystem;

public class Bill implements Payable {

	//Declaration
    private Patient patient;
    private double baseAmount;

    //Constructor
    Bill(Patient patient, double baseAmount) {
        this.patient = patient;
        this.baseAmount = baseAmount;
    }

    @Override
    public double calculatePayment() {
        double tax = baseAmount * 0.05;  
        double discount = patient.isEmergency ? 0 : baseAmount * 0.10;
        return baseAmount + tax - discount;
    }

    void displayBill() {
        System.out.println("Base Amount is about - ₹" + baseAmount);
        System.out.println("Final Bill is about - " + calculatePayment());
    }
}
