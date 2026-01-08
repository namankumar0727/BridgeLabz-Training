package com.loanbuddy;
public class LoanApplication {
    private String loanType;
    private int term; // months
    private double interestRate;

    public LoanApplication(String loanType, int term, double interestRate) {
        this.loanType = loanType;
        this.term = term;
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getLoanType() {
        return loanType;
    }
}
