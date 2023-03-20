package com.company.lessons.inheritance;

public class Jedi extends StarWarsCharacter{

    public Jedi(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(getName() + ": May the Force be with you!");
    }

    @Override
    public void useTheForce() {
        System.out.println(getName() + " uses the Force to move objects.");
    }

    public void defend() {
        System.out.println(getName() + " defends with a lightsaber.");
    }
}
