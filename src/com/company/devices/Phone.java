package com.company.devices;

import com.company.Human;

public class Phone extends Device {

    @Override
    void turnOn() {
        System.out.println("Hello");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        super.sell(buyer, seller, price);

        System.out.println("Podpisz umowę na abonament i inne..");
    }
}
