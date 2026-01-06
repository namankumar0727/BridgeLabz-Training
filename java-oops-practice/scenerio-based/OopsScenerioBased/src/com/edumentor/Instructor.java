package com.edumentor;
class Instructor extends User {

    private String expertise;

    Instructor(int userId, String name, String email, String expertise) {
        super(userId, name, email);
        this.expertise = expertise;
    }

    @Override
    void printDetails() {
        System.out.println("Instructor ID - " + userId);
        System.out.println("Name - " + name);
        System.out.println("Email - " + email);
        System.out.println("Expertise - " + expertise);
    }
}
