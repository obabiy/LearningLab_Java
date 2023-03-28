package com.company.lessons.exceptions.lessonTask;

public class MoneyConvertException extends RuntimeException{

    double hrn;

    public MoneyConvertException(String message, double hrn) {
        super(message);
        this.hrn = hrn;
    }

    public void getDetails(){
        System.out.println("Hrn is less than 0, your num - " + hrn);
    }
}
