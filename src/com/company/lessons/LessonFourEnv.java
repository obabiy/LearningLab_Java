package com.company.lessons;

import com.company.lessons.exceptions.*;
import com.company.lessons.exceptions.divideTask.DivideByRandom;
import com.company.lessons.exceptions.lessonTask.Converter;
import com.company.lessons.exceptions.lessonTask.MoneyConvertException;

import java.io.FileNotFoundException;

public class LessonFourEnv implements Startable {
    @Override
    public void start() {

        ///*** Exceptions ***///

        /// Checked & Unchecked


        FileHandling fileHandling = new FileHandling();

        fileHandling.readFile();        // checked

        System.out.println(2/0);     // unchecked
        System.out.println("After method");



        /// Throw and throws
//
        SomeClass someClass = new SomeClass();
//
//        try {
//            someClass.doSomething();                          // без обробки програма зупиниться
//        } catch (RuntimeException runtimeException) {
//            System.out.println("Some exception was thrown");
//        }
//
//        System.out.println("After method");




        /// Finally block

//        someClass.readDataFromFile();



        /// Catching a fer types of exception

//        try {
//            someClass.doSomething();
//        } catch (FirstException e) {
//            System.out.println("First exception was caught");
//        } catch (SecondException e) {
//            System.out.println("Second exception was caught");
//        } catch (RuntimeException e) {
//            System.out.println("Runtime (Parent class) exception was caught");
//        }



        /// Try with resources

//        someClass.readDataFromFileWithResources();



//        / Custom exceptions

        try {
            someClass.throwCustomExceptionMethod();
        } catch (CustomException e) {
            System.out.println(e.getFullErrorMessage());;
        }


//        / Task - ділення 10 на випадкове число

//        DivideByRandom divideByRandom = new DivideByRandom();
//        divideByRandom.divide();




        /// Task - конвертер грн -> долари, якщо метод приймає від'ємне значення то кидає кастомний ексепшн, в якого
        //         є метод з гетом ерор меседжа, яке містить передане неправильне число

        try{
            System.out.println(Converter.convertToDol(-2));
        } catch (MoneyConvertException e){
            e.getDetails();
        }

    }
}
