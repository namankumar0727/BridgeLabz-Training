package com.skillforge;
class BeginnerCourse extends Course implements ICertifiable {

    BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Beginner Certificate: Course Completion Achieved!");
    }
}
