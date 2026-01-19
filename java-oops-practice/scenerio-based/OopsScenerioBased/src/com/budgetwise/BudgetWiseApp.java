package com.budgetwise;
import java.util.*;

public class BudgetWiseApp {
    public static void main(String[] args) {

        Map<String, Double> categories = new HashMap<>();
        categories.put("Food", 5000.0);
        categories.put("Travel", 3000.0);

        Budget monthly = new MonthlyBudget(20000, 15000, categories);

        monthly.addTransaction(new Transaction(4000, "expense", "Food"));
        monthly.addTransaction(new Transaction(2000, "expense", "Travel"));

        monthly.generateReport();
        monthly.detectOverspend();

        System.out.println();

        Budget annual = new AnnualBudget(240000, 180000, categories);
        annual.addTransaction(new Transaction(190000, "expense", "Mixed"));

        annual.generateReport();
        annual.detectOverspend();
    }
}
