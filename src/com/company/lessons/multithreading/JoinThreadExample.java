package com.company.lessons.multithreading;

public class JoinThreadExample {

    public void show() {

        Thread threadOne = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        threadOne.start();
        try {
            threadOne.join();               // чекаємо завершення виконання threadOne (гарантовано)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadTwo.start();
    }
}
