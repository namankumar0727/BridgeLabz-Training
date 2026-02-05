package com.dealtracker;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DealTracker {

    public static void main(String[] args) {

        File file = new File("answers/deals.txt");

        System.out.println("File exists: " + file.exists());

        Map<String, Deal> dealMap = new HashMap<>();
        Set<String> dealCodes = new HashSet<>();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String code = null;
        LocalDate validTill = null;
        Integer discount = null;
        Integer minPurchase = null;

        try (BufferedReader br =
                     new BufferedReader(
                             new InputStreamReader(
                                     new FileInputStream(file)))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.trim();

                if (line.startsWith("DealCode:")) {

                    // save previous deal
                    if (code != null) {
                        addDeal(code, validTill, discount, minPurchase,
                                dealMap, dealCodes);
                    }

                    code = line.split(":")[1].trim();
                    validTill = null;
                    discount = null;
                    minPurchase = null;

                } else if (line.startsWith("ValidTill:")) {
                    validTill = LocalDate.parse(
                            line.split(":")[1].trim(), formatter);

                } else if (line.startsWith("Discount:")) {
                    discount = Integer.parseInt(
                            line.replaceAll("[^0-9]", ""));

                } else if (line.startsWith("MinimumPurchase:")) {
                    minPurchase = Integer.parseInt(
                            line.split(":")[1].trim());
                }
            }

            // last deal
            addDeal(code, validTill, discount, minPurchase,
                    dealMap, dealCodes);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // sort by discount
        List<Deal> list = new ArrayList<>(dealMap.values());
        list.sort(Comparator.comparingInt(Deal::getDiscount).reversed());

        System.out.println("\nValid Deals (sorted by discount):");
        for (Deal d : list) {
            System.out.println(d);
        }
    }

    private static void addDeal(String code,
                                LocalDate validTill,
                                Integer discount,
                                Integer minPurchase,
                                Map<String, Deal> dealMap,
                                Set<String> dealCodes) {

        if (code == null || validTill == null
                || discount == null || minPurchase == null) {
            return;
        }

        if (validTill.isBefore(LocalDate.now())) {
            return; // expired
        }

        if (!dealCodes.add(code)) {
            return; // duplicate
        }

        Deal deal = new Deal(code, validTill, discount, minPurchase);
        dealMap.put(code, deal);
    }
}
