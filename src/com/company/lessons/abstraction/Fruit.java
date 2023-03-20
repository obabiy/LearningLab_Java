package com.company.lessons.abstraction;

public abstract class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
}


