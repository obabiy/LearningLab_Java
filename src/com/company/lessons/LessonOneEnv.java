package com.company.lessons;

import com.company.lessons.service.simpleInheritance.Car;
import com.company.lessons.service.simpleInheritance.Ford;

public class LessonOneEnv implements Startable{
    @Override
    public void start() {

        //*** Data types ***///

        // Primitives

        byte byteVar = 100;     // -128 to 127   (range)
        short shortVar = 30000;  // -32768 to 32767
        int intVar = 50000000;  // - 2147483648 to 2147483647
        long longVar = 5000000000L;  // -9223372036854775808 to 9223372036854775808

        float floatVar = 8.5f;
        double doubleVar = 8.5; // 2x float (memory & range)

        char charVar = 'A';

        System.out.println(10); // 10 - literal, by default whole number is int type
        System.out.println(10L); // 10 - long literal, add L to point it

        boolean booleanVar = true;



        // Reference data type

        String stringOne = new String("hello");
        String stringTwo = new String("hello");

        System.out.println(stringOne == stringTwo);     // false - comparing the references to a memory part
        System.out.println(stringOne.equals(stringTwo));    // true

        Object object = new Object();   // Any instance of the class also is a reference to memory part



        // Keywords

        /*     new, abstract, boolean..., class, interface, void, static, final, if, else, switch, extends, implements, instanceof,
               private..., super         */



        // Converting and casting types

        short shortValue = 10;
        long longValue = shortValue;    // auto convert
        System.out.println("longValue: " + longValue);

        float floatValue = 10.5f;
        double doubleVal = floatValue;    // auto convert
        System.out.println("doubleValue: " + doubleVal);


        double doubleValue = 10.5;
        int intValue = (int) doubleValue; // convert double to int
        System.out.println("intValue: " + intValue);

        Car car = new Car();   // convert child to parent class
        Ford ford = (Ford) car;



        // Напишіть програму, яка приймає два float числа, і вертає int суму

        Tasks tasks = new Tasks();
        tasks.convertToInt();

    }

}
