package com.streamapi.hospitaldoctor;
import java.util.*;
import java.util.stream.*;

public class HospitalApp {
    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Allen", "Orthopedics", false),
            new Doctor("Dr. Brown", "Neurology", true),
            new Doctor("Dr. Davis", "Dermatology", true),
            new Doctor("Dr. Wilson", "Pediatrics", false)
        );

        List<Doctor> weekendDoctors =
                doctors.stream()
                       .filter(Doctor::isAvailableOnWeekend)
                       .sorted(Comparator.comparing(Doctor::getSpecialty))
                       .collect(Collectors.toList());

        weekendDoctors.forEach(System.out::println);
    }
}
