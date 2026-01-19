package com.gamebox;
public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, 
                         java.util.Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("===== Annual Budget Summary =====");
        System.out.println("Annual Income: " + income);
        System.out.println("Annual Expenses: " + getTotalExpenses());
        System.out.println("Annual Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("⚠ Annual budget exceeded!");
        } else {
            System.out.println("Annual spending is controlled.");
        }
    }
}
