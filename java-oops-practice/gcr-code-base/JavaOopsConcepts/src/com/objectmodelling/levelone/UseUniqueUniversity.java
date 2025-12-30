package com.objectmodelling.levelone;

public class UseUniqueUniversity{
public static void main(String[] args) {

        University uni = new University("ABC University");

        Student s1 = new Student("Naman");
        Student s2 = new Student("Aarav");

        Professor p1 = new Professor("Dr. Sharma");

        Course c1 = new Course("Java Programming");
        Course c2 = new Course("DBMS");
        
        
        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addCourse(c1);
        uni.addCourse(c2);

        // Assign professor to courses
        c1.assignProfessor(p1);
        c2.assignProfessor(p1);

        System.out.println();

        // Students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        System.out.println();
        s1.showCourses();

        System.out.println();
        c1.showStudents();

        System.out.println();
        p1.showCourses();
    }
}
