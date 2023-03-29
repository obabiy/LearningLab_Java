package com.company.lessons.multithreading;

public class WaitNotifyExample {

    public static void show() throws InterruptedException {

        CustomThread customThread = new CustomThread();
        customThread.start();
        synchronized (customThread) {
            customThread.wait();
        }

        System.out.println("Finished");
    }

    public static class CustomThread extends Thread {
        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
                notify();
            }
        }
    }

}
