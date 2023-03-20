package com.company.lessons.task1;

public class Circle extends Shape{
    @Override
    public int getSquare() {
        System.out.println("Calculating circle square");
        return 50;
    }

    public int getSquare(int param) {
        System.out.println("circle square " + param);
        return param;
    }
}
