package com.company;

import com.company.lessons.*;

public class Main {

    public static void main(String[] args) {
        Startable lesson1 = new LessonOneEnv();   // Data types, etc
        Startable lesson2 = new LessonTwoEnv();   // OOP
        Startable lesson3 = new LessonThreeEnv();   // Annotations
        Startable lesson4 = new LessonFourEnv();   // Exceptions
        Startable lesson5 = new LessonFiveEnv();   // Multithreading

//        lesson1.start();    // starts the certain lesson java class
//        lesson2.start();
//        lesson3.start();
//        lesson4.start();
//        lesson5.start();
    }
}
