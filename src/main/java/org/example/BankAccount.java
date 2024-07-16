package org.example;

public class BankAccount implements Payment {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public String withdraw(double amount) {
        if (amount > balance) {
            return "Insufficient funds";
        }
        balance -= amount;
        return "Withdrawn " + amount + ". Remaining balance: " + balance;
    }
}
