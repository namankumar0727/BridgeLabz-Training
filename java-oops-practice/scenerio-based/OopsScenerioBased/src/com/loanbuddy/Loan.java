package com.loanbuddy;
public abstract class Loan implements IApprovable {
    protected Applicant applicant;
    protected LoanApplication application;
    private boolean approved; // restricted access

    public Loan(Applicant applicant, LoanApplication application) {
        this.applicant = applicant;
        this.application = application;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected double emiFormula(double principal, double rate, int term) {
        return (principal * rate * Math.pow(1 + rate, term)) /
               (Math.pow(1 + rate, term) - 1);
    }
}
