package com.loanbuddy;
public class AutoLoan extends Loan {

    public AutoLoan(Applicant applicant, LoanApplication application) {
        super(applicant, application);
    }

    @Override
    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 600;
        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        double monthlyRate = (application.getInterestRate() + 0.5) / 12 / 100;
        return emiFormula(applicant.getLoanAmount(), monthlyRate, application.getTerm());
    }
}
