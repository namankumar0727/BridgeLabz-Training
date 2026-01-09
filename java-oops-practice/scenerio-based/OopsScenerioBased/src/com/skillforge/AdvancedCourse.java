package com.skillforge;
class AdvancedCourse extends Course implements ICertifiable {

    AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Advanced Certificate: Professional Skill Mastered!");
    }
}
