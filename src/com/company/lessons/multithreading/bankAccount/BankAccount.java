package com.company.lessons.multithreading.bankAccount;

public class BankAccount {

    public void startProcessing() throws InterruptedException {

        Balance balance = new Balance();

        BankThread threadOne = new BankThread();
        threadOne.setBalance(balance);
        threadOne.setName("Thread1");

        BankThread threadTwo = new BankThread();
        threadTwo.setBalance(balance);
        threadTwo.setName("Thread2");

        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();

        System.out.println(balance.balance);
    }
}


