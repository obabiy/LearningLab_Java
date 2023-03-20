package com.company.lessons.inheritance;

public class Sith extends StarWarsCharacter{

    public Sith(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(getName() + ": You underestimate the power of the dark side.");
    }

    @Override
    public void useTheForce() {
        System.out.println(getName() + " uses the Dark Side of the Force to choke their enemies.");
    }

    public void attack() {
        System.out.println(getName() + " attacks with a lightsaber.");
    }
}
