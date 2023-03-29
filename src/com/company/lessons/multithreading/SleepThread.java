package com.company.lessons.multithreading;

public class SleepThread extends Thread{
    @Override
    public void run() {
        System.out.println("Custom thread is started");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Custom thread is finished");
    }
}
