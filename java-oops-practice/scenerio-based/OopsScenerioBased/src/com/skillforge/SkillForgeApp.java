package com.skillforge;
import java.util.Scanner;

public class SkillForgeApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Instructor Name: ");
        Instructor instructor = new Instructor(sc.nextLine());

        System.out.print("Enter Student Name: ");
        Student student = new Student(sc.nextLine());

        System.out.println("\nChoose Course Level:");
        System.out.println("1. Beginner");
        System.out.println("2. Advanced");
        int choice = sc.nextInt();
        sc.nextLine();

        Course course;
        ICertifiable certifiable;

        if (choice == 1) {
            course = new BeginnerCourse("Java Fundamentals", instructor);
            certifiable = (ICertifiable) course;
        } else {
            String[] modules = {"Core Java", "OOP", "Collections", "Streams"};
            course = new AdvancedCourse("Advanced Java", instructor, modules);
            certifiable = (ICertifiable) course;
        }

        System.out.println("\nCourse Enrolled: " + course.getTitle());
        System.out.println("Course Rating: " + course.getRating());

        System.out.print("Enter completed modules: ");
        int completed = sc.nextInt();

        student.updateProgress(completed, course.getTotalModules());

        System.out.println("Progress: " + student.getProgress() + "%");

        if (student.getProgress() == 100) {
            certifiable.generateCertificate();
        } else {
            System.out.println("Complete all modules to earn certificate.");
        }

        sc.close();
    }
}
