package com.company.lessons;

import com.company.lessons.abstraction.Apple;
import com.company.lessons.abstraction.Fruit;
import com.company.lessons.encapsulation.BankAccount;
import com.company.lessons.inheritance.Jedi;
import com.company.lessons.inheritance.Sith;
import com.company.lessons.polymorphism.Animal;
import com.company.lessons.polymorphism.Cat;
import com.company.lessons.polymorphism.Dog;
import com.company.lessons.task1.Circle;

public class LessonTwoEnv implements Startable {

    @Override
    public void start() {

        //*** Inheritance ***//

        Sith darthVader = new Sith("Darth Vader", 46);
        Jedi obiWanKenobi = new Jedi("Obi-Wan Kenobi", 57);

        darthVader.speak();
        obiWanKenobi.speak();

        System.out.println("***************");

        darthVader.useTheForce();
        obiWanKenobi.useTheForce();

        System.out.println("***************");

        darthVader.attack();
        obiWanKenobi.defend();


        //*** Polymorphism ***//

        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

        animalWalk(myDog);


        //*** Encapsulation ***//

        BankAccount bankAccount = new BankAccount(1000);

//        bankAccount.balance = 2000;

        bankAccount.deposit(1000);

        System.out.println("Balance: " + bankAccount.getBalance());

        bankAccount.withdraw(1500);
        bankAccount.withdraw(700);


        //*** Abstraction ***//

        Fruit fruit = new Apple("apple");
        fruit.eat();


        // **** Method overload

        sayHello();
        sayHello("Jack");


        // **** Task with shapes

        Circle circle = new Circle();
        circle.getSquare();
        circle.getSquare(58);
    }

    private void sayHello(String name) {
        System.out.println(name + " says hello");
    }

    private void sayHello() {
        System.out.println("Says hello");
    }

    private void animalWalk(Animal animal) {
        animal.makeSound();
    }
}
