package com.loanbuddy;
public class PersonalLoan extends Loan {

    public PersonalLoan(Applicant applicant, LoanApplication application) {
        super(applicant, application);
    }

    @Override
    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 650 &&
                         applicant.getIncome() >= applicant.getLoanAmount() / 10;
        setApproved(status);
        return status;
    }

    @Override
    public double calculateEMI() {
        double monthlyRate = application.getInterestRate() / 12 / 100;
        return emiFormula(applicant.getLoanAmount(), monthlyRate, application.getTerm());
    }
}
