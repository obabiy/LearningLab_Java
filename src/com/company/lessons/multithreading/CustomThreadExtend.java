package com.company.lessons.multithreading;

public class CustomThreadExtend extends Thread{
    @Override
    public void run() {
        System.out.println("Custom thread (extend) is running, name: " + Thread.currentThread().getName());
    }
}
