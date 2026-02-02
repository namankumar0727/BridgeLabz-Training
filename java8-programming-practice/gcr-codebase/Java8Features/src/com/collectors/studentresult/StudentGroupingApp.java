package com.collectors.studentresult;
import java.util.*;
import java.util.stream.*;

public class StudentGroupingApp {
    public static void main(String[] args) {

        List<Student> students = List.of(
            new Student("Alice", "Grade A"),
            new Student("Bob", "Grade B"),
            new Student("Charlie", "Grade A"),
            new Student("Diana", "Grade C"),
            new Student("Ethan", "Grade B")
        );

        Map<String, List<String>> studentsByGrade =  students.stream()
                                                     .collect(Collectors.groupingBy( Student::getGradeLevel,
                                                     Collectors.mapping(Student::getName,Collectors.toList())));
                   

        studentsByGrade.forEach((grade, names) ->
            System.out.println(grade + " : " + names)
        );
    }
}
