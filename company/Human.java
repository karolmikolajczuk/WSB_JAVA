package com.company;

public class Human {
    private String name;
    private String surname;
    private Double age;
    private Integer id; // pesel
    private Animal animal;
    private Phone number;
    private Double salary;

    public Human(String name, String surname, Double age, Integer id, Animal animal, Phone number, Double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.animal = animal;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Phone getNumber() {
        return number;
    }

    public void setNumber(Phone number) {
        this.number = number;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }
}
