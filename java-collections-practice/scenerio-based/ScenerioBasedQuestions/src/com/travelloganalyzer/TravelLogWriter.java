package com.travelloganalyzer;

import java.io.*;
import java.util.List;

public class TravelLogWriter {

    public static void writeTrips(List<Trip> trips, String filePath) throws IOException {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(trips);
        }
    }
}
