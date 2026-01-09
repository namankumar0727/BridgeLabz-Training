package com.skillforge;
class Course {
    private String title;
    private Instructor instructor;
    protected double rating;        // encapsulated logic
    private String[] modules;
    private final String[] reviews; // read-only internal reviews

    // Default constructor
    Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Advanced"};
        this.reviews = new String[]{"Good", "Very Good"};
        this.rating = calculateRating();
    }

    // Custom modules constructor
    Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[]{"Excellent"};
        this.rating = calculateRating();
    }

    protected double calculateRating() {
        return reviews.length * 2.5; // protected logic
    }

    public String getTitle() {
        return title;
    }

    public int getTotalModules() {
        return modules.length;
    }

    public double getRating() {
        return rating;
    }
}
