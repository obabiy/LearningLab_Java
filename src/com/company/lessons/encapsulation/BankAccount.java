package com.company.lessons.encapsulation;

public class BankAccount {

    private int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Completed");
        } else {
            System.out.println("Not enough money.");
        }
    }

    public int getBalance() {
        return balance;
    }

}
