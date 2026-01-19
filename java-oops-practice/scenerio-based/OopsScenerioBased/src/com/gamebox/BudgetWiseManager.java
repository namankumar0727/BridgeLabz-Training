package com.budgetwise;
import java.util.HashMap;
import java.util.Map;

public class BudgetWiseManager {
    public static void main(String[] args) {

        Map<String, Double> categories = new HashMap<>();
        categories.put("Food", 5000.0);
        categories.put("Travel", 3000.0);
        categories.put("Entertainment", 2000.0);

        Budget monthly = new MonthlyBudget(30000, 20000, categories);
        Budget annual = new AnnualBudget(360000, 240000, categories);

        monthly.addTransaction(new Transaction(4000, "expense", "Food"));
        monthly.addTransaction(new Transaction(2500, "expense", "Travel"));

        annual.addTransaction(new Transaction(120000, "expense", "Food"));
        annual.addTransaction(new Transaction(80000, "expense", "Travel"));

        // Polymorphism
        monthly.generateReport();
        monthly.detectOverspend();

        System.out.println();

        annual.generateReport();
        annual.detectOverspend();
    }
}
