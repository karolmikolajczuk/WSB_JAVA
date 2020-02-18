package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Animal {

    // visible if in the same package
    private String species;
    private String name;
    private BigDecimal weight;
    private File pic;
    private boolean isAlive;

    Animal(String species, String name, BigDecimal weight, File picture) {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.pic = picture;
        this.isAlive = true;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public File getPic() {
        return pic;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    public void feedAnimal() {
        weight.subtract(new BigDecimal(1));
        System.out.println("Food eaten, animal weight's now: " + this.weight);
    }

    public void goForWalk(Double distance) {
        while(distance > 0) {
            System.out.println("Distance to make: " + distance);
            --distance;
            this.weight = this.weight.subtract(new BigDecimal(1));
            this.weight = this.weight.setScale(2, RoundingMode.HALF_UP);
            System.out.println(this.weight);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Catched error when thread sleeps");
                e.printStackTrace();
            }
            this.isHungry();
            if(!this.animalState()) break;
        }
        System.out.println("Weight after walk: " + this.weight);
    }

    public boolean animalState() {
        if (this.weight.doubleValue() <= 0) {
            System.out.println("Animal is dead");
            this.isAlive = false;
            return false;
        }
        System.out.println("Animal is alive");
        return true;
    }

    public void isHungry() {
        if (this.weight.doubleValue() <= 5.0 && this.animalState()) {
            System.out.println("I'm hungry");
            return;
        }
        System.out.println("I'm not hungry");
    }
}
