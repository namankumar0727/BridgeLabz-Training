package com.gamebox;
public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, 
                          java.util.Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("----- Monthly Budget Report -----");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("⚠ Monthly budget exceeded!");
        } else {
            System.out.println("Monthly spending is within limit.");
        }
    }
}
