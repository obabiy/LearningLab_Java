package com.company;

import com.company.lessons.LessonOneEnv;
import com.company.lessons.LessonTwoEnv;
import com.company.lessons.Startable;

public class Main {

    public static void main(String[] args) {
        Startable lesson1 = new LessonOneEnv();   // data types, etc
        Startable lesson2 = new LessonTwoEnv();   // OOP

        lesson1.start();    // starts the certain lesson java class
        lesson2.start();
    }
}
