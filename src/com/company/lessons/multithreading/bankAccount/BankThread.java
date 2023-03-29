package com.company.lessons.multithreading.bankAccount;

public class BankThread extends Thread{

    Balance balance;

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    @Override
    public void run() {
        balance.withdraw(250);
    }
}
