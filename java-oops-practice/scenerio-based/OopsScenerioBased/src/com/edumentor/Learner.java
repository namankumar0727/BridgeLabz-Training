package com.edumentor;
class Learner extends User implements ICertifiable {

	// "Short" or "Full-Time"
    private String courseType; 

    Learner(int userId, String name, String email, String courseType) {
        super(userId, name, email);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("Short")) {
            System.out.println("Top 1% Markse Certificate issued to " + name);
        } else {
            System.out.println("🏅 Full-Time Course Certificate issued to " + name);
        }
    }

    @Override
    void printDetails() {
        System.out.println("Learner ID - " + userId);
        System.out.println("Name - " + name);
        System.out.println("Email - " + email);
        System.out.println("Course Type - " + courseType);
    }
}
