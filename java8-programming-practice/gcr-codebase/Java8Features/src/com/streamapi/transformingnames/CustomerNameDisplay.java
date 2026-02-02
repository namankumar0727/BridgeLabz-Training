package com.streamapi.transformingnames;
import java.util.*;
import java.util.stream.*;

public class CustomerNameDisplay {
    public static void main(String[] args) {

        List<String> customerNames = List.of(
            "anita",
            "Rahul",
            "john",
            "Priya",
            "michael"
        );

        List<String> formattedNames =
                customerNames.stream()
                             .map(String::toUpperCase)
                             .sorted()
                             .collect(Collectors.toList());

        formattedNames.forEach(System.out::println);
    }
}
