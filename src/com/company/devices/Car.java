package com.company.devices;

import com.company.Human;

public class Car extends Device {

    private String plates;

    public String getPlates() {
        return plates;
    }
    public void setPlates(String plates) {
        this.plates = plates;
    }

    @Override
    void turnOn() {
        System.out.println("Now car is working");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        super.sell(buyer, seller, price);

        System.out.println("Akcyza, rejestracja samochodu itp..");
    }
}
