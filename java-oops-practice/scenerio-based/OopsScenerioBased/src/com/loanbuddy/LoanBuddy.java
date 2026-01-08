package com.loanbuddy;
public class LoanBuddy {
    public static void main(String[] args) {

        Applicant applicant = new Applicant("Naman", 720, 85000, 500000);

        LoanApplication app =
                new LoanApplication("Home", 240, 8.5);

        Loan loan = new HomeLoan(applicant, app); 

        if (loan.approveLoan()) {
            System.out.println("Loan Approved!");
            System.out.println("Monthly EMI - " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected.");
        }
    }
}
