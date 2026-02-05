package com.medinventory;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class MedInventory<T extends Item> {

    // Regex for dd-MM-yyyy
    private static final Pattern DATE_PATTERN =
            Pattern.compile("\\b\\d{2}-\\d{2}-\\d{4}\\b");

    private static final int CRITICAL_LEVEL = 10;

    public static void main(String[] args) {

        File file = new File("answers/inventory.csv");

        Set<Item> uniqueItems = new HashSet<>();
        Map<String, List<Item>> categoryMap = new HashMap<>();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                try {
                    String[] parts = line.split(",");

                    if (parts.length != 4) {
                        throw new IllegalArgumentException("Invalid CSV format");
                    }

                    String id = parts[0];
                    String name = parts[1];
                    int quantity = Integer.parseInt(parts[2]);
                    String expiry = parts[3];

                    // Validate expiry date using regex
                    if (!DATE_PATTERN.matcher(expiry).matches()) {
                        throw new IllegalArgumentException("Invalid expiry date");
                    }

                    Item item = new Item(id, name, quantity, expiry);

                    // Check for low stock
                    if (quantity < CRITICAL_LEVEL) {
                        throw new LowStockException(
                                " Low stock alert for item: " + name
                        );
                    }

                    uniqueItems.add(item);

                    // Categorize by item name
                    categoryMap
                            .computeIfAbsent(name, k -> new ArrayList<>())
                            .add(item);

                    // Detect expired items
                    LocalDate expiryDate =
                            LocalDate.parse(expiry, formatter);

                    if (expiryDate.isBefore(LocalDate.now())) {
                        System.out.println(" Expired Item: " + item);
                    }

                } catch (LowStockException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("Skipping invalid record: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Summary
        System.out.println("\n Inventory Summary:");
        categoryMap.forEach((k, v) ->
                System.out.println(k + " → " + v.size() + " items"));

        System.out.println("\n Unique items count: " + uniqueItems.size());
    }
}
