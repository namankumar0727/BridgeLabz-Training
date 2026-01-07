package com.fittracker;
class UserProfile {

    private String name;
    private int age;
    private double weight;     
    private int dailyCalorieGoal;

    // Constructor with default goal
    UserProfile(String name, int age, double weight) {
        this(name,age,weight,2000);
    }

    // Constructor with custom goal
    UserProfile(String name, int age, double weight, int dailyCalorieGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    // Controlled access to weight
    public double getWeight() {
        return weight;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public void printProfile() {
        System.out.println("User - " + name);
        System.out.println("Age - " + age);
        System.out.println("Daily Calorie Goal - " + dailyCalorieGoal);
    }
}
