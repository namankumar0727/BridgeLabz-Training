package com.mutilevelinheritence;

public class CourseManagement {
    public static void main(String[] args) {
    	
        Course c1 = new Course("Data Structures", 40);
        Course c2 = new OnlineCourse("Java Programming", 60, "Coursera", true);
        Course c3 = new PaidOnlineCourse("Full Stack Development",
                120, "Udemy", true, 15000, 20);

        c1.displayDetails();
        System.out.println();

        c2.displayDetails();
        System.out.println();

        c3.displayDetails();
    }
}
