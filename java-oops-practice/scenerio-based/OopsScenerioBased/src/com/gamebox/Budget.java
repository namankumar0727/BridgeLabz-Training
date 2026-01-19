package com.gamebox;
import java.util.*;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Encapsulation: no direct editing of expenses
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // Operator usage
    public double calculateNetSavings() {
        return income - getTotalExpenses();
    }
}
