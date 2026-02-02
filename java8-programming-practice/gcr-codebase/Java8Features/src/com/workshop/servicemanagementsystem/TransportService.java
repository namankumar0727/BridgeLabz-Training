package com.workshop.servicemanagementsystem;

public interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    String getDepartureTime();

    // Default method 
    default void printServiceDetails() {
        System.out.println( getServiceName() + " | Route: " + getRoute() +
                            " | Fare: " + getFare() + " | Departure: " + getDepartureTime());
    }
}
