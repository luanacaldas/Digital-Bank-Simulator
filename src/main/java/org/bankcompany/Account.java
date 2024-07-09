package org.bankcompany;

public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public abstract void withdraw(double amount); // Abstract method for withdrawal

    public void transfer(Account destination, double amount) {
        if (amount > 0 && amount <= balance) {
            withdraw(amount);
            destination.deposit(amount);
            System.out.println("Transfer of $" + amount + " to account " + destination.getAccountNumber() + " successful.");
        } else {
            System.out.println("Transfer failed. Check your balance or the transfer amount.");
        }
    }
}
