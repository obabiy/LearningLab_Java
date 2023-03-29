package com.company.lessons.multithreading;

public class CustomThreadImplement implements Runnable{
    @Override
    public void run() {
        System.out.println("Custom thread (implement) is running, name: " + Thread.currentThread().getName());
    }
}
