package com.company;

import java.io.File;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal(
                "Husky", "myDog", new BigDecimal(40), new File("somedog.jpg"));

        System.out.println( dog.getName() + " is " +
                            dog.getSpecies() + " weight's " +
                            dog.getWeight() + " kg.");
        dog.goForWalk(10.0);
        dog.feedAnimal();

        Human czlek = new Human(
                "Jan", "Kowalski", new Double(35), new Integer(00000000000),
                new Animal("Doggy", "TheDog", new BigDecimal(40), new File("")),
                new Phone(123456789, "T-Mobile", 48),
                new Double(3000.5)
        );

        System.out.println(czlek.getAge());
        System.out.println(czlek.getSalary());
    }

}
