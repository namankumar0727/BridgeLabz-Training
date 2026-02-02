package com.streamapi.filterexpiring;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class GymMembershipApp {
    public static void main(String[] args) {

        List<GymMember> members = List.of(
            new GymMember("Alice", LocalDate.now().plusDays(10)),
            new GymMember("Bob", LocalDate.now().plusDays(45)),
            new GymMember("Charlie", LocalDate.now().plusDays(25)),
            new GymMember("Diana", LocalDate.now().plusDays(5)),
            new GymMember("Ethan", LocalDate.now().plusDays(90))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<GymMember> expiringSoon = members.stream()
                                      .filter(member ->
                                      !member.getExpiryDate().isBefore(today) &&
                                      !member.getExpiryDate().isAfter(next30Days))
                                      .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}
