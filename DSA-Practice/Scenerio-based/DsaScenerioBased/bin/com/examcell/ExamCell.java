package com.examcell;
public class ExamCell {
    public static void main(String[] args) {

        // Pre-sorted center-wise scores (descending)
        Student[] center1 = {
            new Student(101, "Amit", 95),
            new Student(102, "Neha", 88),
            new Student(103, "Ravi", 80)
        };

        Student[] center2 = {
            new Student(201, "Suman", 92),
            new Student(202, "Karan", 85),
            new Student(203, "Pooja", 78)
        };

        // Merge all centers
        Student[] allStudents = new Student[
                center1.length + center2.length];

        int index = 0;
        for (Student s : center1) allStudents[index++] = s;
        for (Student s : center2) allStudents[index++] = s;

        System.out.println("Before Sorting (Merged Centers):");
        ExamCellSorter.display(allStudents);

        ExamCellSorter.mergeSort(allStudents, 0, allStudents.length - 1);

        System.out.println("\nState-Level Rank List:");
        ExamCellSorter.display(allStudents);
    }
}
