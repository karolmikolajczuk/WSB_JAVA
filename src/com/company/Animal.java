package com.company;

import java.io.File;

public class Animal implements Edible, Saleable {
    final String species;
    private Double weight;
    public String name;
    File pic;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 123.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
        }
    }

    void feed() {
        if (weight <= 0) {
            System.out.println("too late man");
        } else {
            weight++;
            System.out.println("thx bro, my weight is now " + this.weight);
        }
    }

    void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("im dead sir");
        } else if (weight <= 3) {
            System.out.println("food first");
        } else {
            System.out.println("nice walk, my weight is now " + this.weight);
        }
    }

    public String toString(){
        return this.species + " " + this.name;
    }

    @Override
    public void beEaten() throws Exception {
        weight = 0.0;
        System.out.println("sayonara " + this.species);
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("Wrong invoke");
        }

        if (buyer.cash < price) {
            throw new Exception("No money, no pet bro");
        }

        buyer.cash -= price;
        seller.cash += price;

        buyer.pet = seller.pet;
        seller.pet = null;

        System.out.println("Pet was sold.");
    }
}
