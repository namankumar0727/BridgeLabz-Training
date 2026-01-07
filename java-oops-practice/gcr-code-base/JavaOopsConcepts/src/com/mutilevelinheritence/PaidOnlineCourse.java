package com.mutilevelinheritence;

public class PaidOnlineCourse extends OnlineCourse {
	
	//Declaring the variables
    double fee;
    double discount; 

    //Constructors
    PaidOnlineCourse(String courseName, int duration,
                     String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: ₹" + finalFee);
    }
}
