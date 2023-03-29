package com.company.lessons;

import com.company.lessons.multithreading.*;
import com.company.lessons.multithreading.bankAccount.BankAccount;

public class LessonFiveEnv implements Startable{
    @Override
    public void start() {

        ///*** Multithreading  ***///

        /// *** Creating types

//        CustomThreadExtend customThreadExtend = new CustomThreadExtend();
//        customThreadExtend.start();             // додаємо новий потік в пул потоків
//        customThreadExtend.start();

//        CustomThreadImplement customThreadImplementRun = new CustomThreadImplement();
//        Thread customThreadImplement = new Thread(customThreadImplementRun);
//        customThreadImplement.start();



        /// Життєвий цикл потоку - New -> Runnable( <- -> Blocked/Waiting/Sleeping) -> Running -> Dead


        // Sleep

//        SleepThread sleepThread = new SleepThread();
//        sleepThread.start();

        // Yield & Schedule Priority

//        YieldThreadExample yieldThread = new YieldThreadExample();
//        yieldThread.show();



        /// *** Синхронізація


        // Join

//        JoinThreadExample joinThreadExample = new JoinThreadExample();
//        joinThreadExample.show();



        /// synchronized

//        BankAccount bankAccount = new BankAccount();   // несинхронізований/синхронізований приклад
//        try {
//            bankAccount.startProcessing();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



        /// Wait & Notify

//        WaitNotifyExample waitNotifyExample = new WaitNotifyExample();
//        try {
//            waitNotifyExample.show();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
