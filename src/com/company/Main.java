package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Karol";
        me.lastName = "Mikołajczuk";
        me.pet = new Animal("Cat");
        me.pet.name = "Kitty";

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();


        Car dirtyOne = new Car();
        dirtyOne.producer = "AlfaRomeo";
        dirtyOne.model = "Giulietta";
        dirtyOne.yearOfProduction = 1997;
        dirtyOne.setPlates("GD1234");

        me.setCar(dirtyOne);

        Human myWife = new Human();
        myWife.firstName = "Anna";
        myWife.lastName = "Kowalska";
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.setCar(me.getCar());

        System.out.println(myWife.getCar().getPlates());

        System.out.println(me.getCar());
        System.out.println(myWife.getCar());

        System.out.println(me);
        System.out.println(myWife);

        System.out.println(me.pet);

        new Phone();
        new Car();

        me.sell();
        me.beEaten();

    }
}
