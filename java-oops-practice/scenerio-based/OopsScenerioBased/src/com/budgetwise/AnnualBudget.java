package com.budgetwise;
class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit,
                        Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("===== Annual Budget Summary =====");
        System.out.println("Yearly Income: " + income);
        System.out.println("Yearly Expenses: " + getTotalExpenses());
        System.out.println("Annual Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("⚠ Annual budget exceeded!");
        }
    }
}
