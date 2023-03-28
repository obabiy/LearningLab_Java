package com.company.lessons.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SomeClass {

    private static final String TXT_FILE_PATH = "D:/Work/LearningLab_Java/src/com/company/lessons/exceptions/text_file.txt";


    public void doSomething() throws RuntimeException {
        throw new RuntimeException("Some exception message");
    }

    public void readDataFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(TXT_FILE_PATH));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close(); // Пробуємо закрити потік
                } catch (IOException e) {
                    // Обробка винятку виконання
                }
            }
        }
    }


    public void readDataFromFileWithResources() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TXT_FILE_PATH))) {    // автозакриття потоку
            String line = reader.readLine();
        } catch (IOException e) {
            // Обробка винятків
        }
    }


    public void throwCustomExceptionMethod() throws CustomException {
        throw new CustomException(403, "Some custom error message");
    }

}