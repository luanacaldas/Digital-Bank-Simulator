package org.bankcompany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CheckingAccount checkingAccount = new CheckingAccount("12345", 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount("67890");

        System.out.println("Welcome to the banking system!");

        // Example operations (replace with user input/menu)
        checkingAccount.deposit(500.0);
        savingsAccount.deposit(1000.0);
        checkingAccount.transfer(savingsAccount, 200.0);
        checkingAccount.withdraw(100.0);
        savingsAccount.withdraw(50.0);

        scanner.close();

        System.out.println("\nFinal Balances:");
        System.out.println("Checking Account: $" + checkingAccount.getBalance());
        System.out.println("Savings Account: $" + savingsAccount.getBalance());
    }
}
