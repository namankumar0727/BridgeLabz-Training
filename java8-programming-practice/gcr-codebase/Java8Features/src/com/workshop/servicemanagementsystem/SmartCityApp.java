package com.workshop.servicemanagementsystem;
import java.util.*;
import java.util.stream.*;

public class SmartCityApp {

    public static void main(String[] args) {

        List<TransportService> services = List.of(
            new BusService("A-B", 30, "08:30"),
            new MetroService("A-C", 25, "08:15"),
            new TaxiService("A-B", 60, "08:10"),
            new AmbulanceService("Emergency Route", 0, "NOW")
        );

        // 1. Lambda: Filter & sort services
        services.stream()
                .filter(s -> s.getFare() <= 50)
                .sorted(Comparator.comparing(TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        System.out.println("----- Dashboard Live Update -----");

        // 2. forEach(): Live dashboard display
        services.forEach(TransportService::printServiceDetails);

        // 3. Emergency detection using marker interface
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s ->
                    System.out.println("Priority Service: " + s.getServiceName())
                );

        // Passenger data
        List<PassengerTrip> trips = List.of(
            new PassengerTrip("A-B", 30, true),
            new PassengerTrip("A-B", 30, false),
            new PassengerTrip("A-C", 25, true),
            new PassengerTrip("A-C", 25, false),
            new PassengerTrip("A-C", 25, true)
        );

        // 4. groupingBy(): Passengers per route
        Map<String, List<PassengerTrip>> tripsByRoute =
                trips.stream()
                     .collect(Collectors.groupingBy(PassengerTrip::getRoute));

        // 5. partitioningBy(): Peak vs Non-Peak
        Map<Boolean, List<PassengerTrip>> peakPartition =
                trips.stream()
                     .collect(Collectors.partitioningBy(PassengerTrip::isPeakHour));

        // 6. summarizingDouble(): Revenue stats
        DoubleSummaryStatistics revenueStats =
                trips.stream()
                     .collect(Collectors.summarizingDouble(PassengerTrip::getFare));

        System.out.println("Total Revenue: " + revenueStats.getSum());
        System.out.println("Average Fare: " + revenueStats.getAverage());
    }
}
