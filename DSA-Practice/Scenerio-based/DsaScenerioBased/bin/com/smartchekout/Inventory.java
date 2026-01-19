package com.smartchekout;
import java.util.HashMap;
import java.util.Map;

class Inventory {
    private Map<String, Integer> priceMap = new HashMap<>();
    private Map<String, Integer> stockMap = new HashMap<>();

    public Inventory() {
        priceMap.put("Milk", 50);
        stockMap.put("Milk", 10);

        priceMap.put("Bread", 40);
        stockMap.put("Bread", 8);

        priceMap.put("Eggs", 6);
        stockMap.put("Eggs", 30);
    }

    public int getPrice(String item) {
        return priceMap.getOrDefault(item, 0);
    }

    public boolean updateStock(String item) {
        if (stockMap.containsKey(item) && stockMap.get(item) > 0) {
            stockMap.put(item, stockMap.get(item) - 1);
            return true;
        }
        return false;
    }
}
