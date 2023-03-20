package com.company.lessons.abstraction;

public class Apple extends Fruit{
    public Apple(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Eating " + getName() + "...");
    }
}
