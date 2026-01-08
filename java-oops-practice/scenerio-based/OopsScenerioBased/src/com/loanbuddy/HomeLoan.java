package com.loanbuddy;
public class HomeLoan extends Loan {

    public HomeLoan(Applicant applicant, LoanApplication application) {
        super(applicant, application);
    }

    @Override
    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 700 &&
                         applicant.getIncome() >= applicant.getLoanAmount() / 15;
        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        double discountedRate = (application.getInterestRate() - 1) / 12 / 100;
        return emiFormula(applicant.getLoanAmount(), discountedRate, application.getTerm());
    }
}
