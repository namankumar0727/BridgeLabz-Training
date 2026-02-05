package com.travelloganalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLogAnalyzer {

    public static void main(String[] args) {

        String filePath = "trips/trips.dat";

        // STEP 1: Create sample trips (only once)
        createSampleTrips(filePath);

        // STEP 2: Read trips from file
        List<Trip> trips = readTrips(filePath);

        // 1️⃣ All cities visited (Regex over notes)
        System.out.println("\n📍 Cities mentioned in notes:");
        Pattern cityPattern = Pattern.compile("\\b(Paris|Rome|Berlin|Delhi|Tokyo)\\b",
                Pattern.CASE_INSENSITIVE);

        for (Trip trip : trips) {
            Matcher matcher = cityPattern.matcher(trip.getNotes());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

        // 2️⃣ Trips longer than 5 days
        System.out.println("\n🕒 Trips longer than 5 days:");
        trips.stream()
                .filter(t -> t.getDurationDays() > 5)
                .forEach(System.out::println);

        // 3️⃣ Unique countries visited (Set)
        Set<String> countries = new HashSet<>();
        for (Trip trip : trips) {
            countries.add(trip.getCountry());
        }

        System.out.println("\n🌍 Unique countries visited:");
        countries.forEach(System.out::println);

        // 4️⃣ Top 3 cities visited most often
        Map<String, Integer> cityCountMap = new HashMap<>();

        for (Trip trip : trips) {
            cityCountMap.put(trip.getCity(),
                    cityCountMap.getOrDefault(trip.getCity(), 0) + 1);
        }

        System.out.println("\n🏆 Top 3 most visited cities:");
        cityCountMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(e ->
                        System.out.println(e.getKey() + " → " + e.getValue() + " trips"));
    }

    // ---------- Helper Methods ----------

    private static void createSampleTrips(String filePath) {
        File file = new File(filePath);
        if (file.exists()) return;

        List<Trip> trips = List.of(
                new Trip("Paris", "France", 7, "Visited Paris and Rome"),
                new Trip("Rome", "Italy", 4, "Explored Rome and history"),
                new Trip("Berlin", "Germany", 6, "Berlin nightlife experience"),
                new Trip("Paris", "France", 5, "Second visit to Paris"),
                new Trip("Tokyo", "Japan", 10, "Tokyo and Delhi food tour")
        );

        try {
            new File("trips").mkdir();
            TravelLogWriter.writeTrips(trips, filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Trip> readTrips(String filePath) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filePath))) {

            return (List<Trip>) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
