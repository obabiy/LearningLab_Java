package com.company.lessons.inheritance;

public class StarWarsCharacter {

    private String name;
    private int age;

    public StarWarsCharacter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("My name is " + name + ".");
    }

    public void useTheForce() {
        System.out.println(name + " uses the Force!");
    }

    public String getName() {
        return name;
    }
}
