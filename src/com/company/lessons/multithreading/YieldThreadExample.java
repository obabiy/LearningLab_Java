package com.company.lessons.multithreading;

public class YieldThreadExample {

    public void show() {
        Thread threadOne = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
                Thread.yield();             // Пінгаємо scheduler, що можемо передати процесорний час інакшому потоку
            }
        });

        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
                Thread.yield();
            }
        });

        threadOne.start();
        threadTwo.start();
    }
}
