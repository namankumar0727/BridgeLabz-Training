package com.mutilevelinheritence;

public class OnlineCourse extends Course {
	
	//Declaring the varibles
    String platform;
    boolean isRecorded;

    //Construtors
    OnlineCourse(String courseName, int duration,
                 String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
