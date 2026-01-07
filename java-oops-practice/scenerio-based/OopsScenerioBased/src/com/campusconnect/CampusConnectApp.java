package com.campusconnect;
public class CampusConnectApp {
    public static void main(String[] args) {

        Faculty faculty = new Faculty(101, "Dr. Thakur",
                "thakur@college.edu", "Computer Science");

        Course javaCourse = new Course("Java Programming", faculty);

        Student s1 = new Student(201, "naman", "naman@college.edu");
        Student s2 = new Student(202, "aman", "aman@college.edu");

        s1.addGrade(8);
        s1.addGrade(9);

        s2.addGrade(7);
        s2.addGrade(8);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        System.out.println("\n--------------");
        Person p1 = s1;
        Person p2 = faculty;

        p1.printDetails();
        System.out.println();
        p2.printDetails();

        javaCourse.displayCourseDetails();
    }
}
