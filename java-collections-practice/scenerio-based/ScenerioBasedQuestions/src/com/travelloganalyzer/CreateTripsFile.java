package com.travelloganalyzer;

import java.io.*;
import java.util.*;

public class CreateTripsFile {

    public static void main(String[] args) {

        List<Trip> trips = new ArrayList<>();

        trips.add(new Trip(
                "Paris",
                "France",
                7,
                "Visited Paris and Rome, amazing food and culture"
        ));

        trips.add(new Trip(
                "Rome",
                "Italy",
                4,
                "Explored Rome historical places"
        ));

        trips.add(new Trip(
                "Berlin",
                "Germany",
                6,
                "Berlin nightlife and museums"
        ));

        trips.add(new Trip(
                "Paris",
                "France",
                5,
                "Second visit to Paris"
        ));

        trips.add(new Trip(
                "Tokyo",
                "Japan",
                10,
                "Tokyo and Delhi food tour"
        ));

        // Create folder if not exists
        new File("trips").mkdir();

        // Serialize trips
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream("trips/trips.dat"))) {

            oos.writeObject(trips);
            System.out.println("✅ trips.dat created successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
