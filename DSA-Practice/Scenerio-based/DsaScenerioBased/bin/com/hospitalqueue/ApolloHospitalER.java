package com.hospitalqueue;
public class ApolloHospitalER {
    public static void main(String[] args) {

        Patient[] patients = {
            new Patient(101, "Ravi", 3),
            new Patient(102, "Anita", 8),
            new Patient(103, "Karan", 5),
            new Patient(104, "Meena", 10),
            new Patient(105, "Suresh", 2)
        };

        System.out.println("Before Sorting (Arrival Order):");
        HospitalQueue.displayPatients(patients);

        HospitalQueue.sortByCriticality(patients);

        System.out.println("\nAfter Sorting (By Criticality):");
        HospitalQueue.displayPatients(patients);
    }
}
