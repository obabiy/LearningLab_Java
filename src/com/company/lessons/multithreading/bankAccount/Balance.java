package com.company.lessons.multithreading.bankAccount;

public class Balance {
    int balance = 1000;

    public void withdraw(int amount) {
        synchronized (this) {
            int b = this.balance; // 1000

            if (Thread.currentThread().getName().equals("Thread1")){
                Thread.yield();
            }

            this.balance = b - amount;
        }
    }
}
