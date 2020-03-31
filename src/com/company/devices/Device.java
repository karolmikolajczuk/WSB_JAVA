package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public abstract class Device implements Saleable {

    public String producer;
    public String model;
    public Integer yearOfProduction;
    public final Double value = 10000.0;

    public String toString(){
        return this.producer + " " + this.model;
    }

    abstract void turnOn();

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (this instanceof Device) {
            System.out.println("weird, man.");
        }

        if (buyer.cash < price) {
            System.out.println("dude, please..");
        }

        buyer.cash -= price;
        seller.cash += price;

        System.out.println("Device sold.");
    }

}
