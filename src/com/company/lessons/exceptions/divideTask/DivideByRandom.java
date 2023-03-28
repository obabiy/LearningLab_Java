package com.company.lessons.exceptions.divideTask;

import java.util.Random;

public class DivideByRandom {
    public void divide() {
        boolean shouldStop = false;
        while(!shouldStop) {
            Random random = new Random();
            int divisor = random.nextInt(6); // генеруємо випадкове число 0 до 5
            try {
                int result = 10 / divisor; // виконуємо ділення
                System.out.println("The result of dividing 10 by " + divisor + ": " + result);
            } catch (ArithmeticException e) { // обробка exception
                System.out.println("Error: dividing by zero");
                shouldStop = true;
            } finally { //              закриваємо/чистимо дані
                System.out.println("The program is finished.");
                System.out.println("************************");
            }
        }
    }
}
