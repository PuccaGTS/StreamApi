package org.example.lesson49optional.task2;

import java.util.Arrays;

public class Human {
    String name;
    Human mother;
    Human father;
    Human[] children;
    Appartment appartment;
    Car car;
    String profession;

    public Human(String name, Appartment appartment, String profession) {
        this.name = name;
        this.appartment = appartment;
        this.profession = profession;
    }

    public Human(String name, Human mother, Human father, Human[] children, Appartment appartment, Car car, String profession) {
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.appartment = appartment;
        this.car = car;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Appartment getAppartment() {
        return appartment;
    }

    public void setAppartment(Appartment appartment) {
        this.appartment = appartment;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", appartment=" + appartment +
                ", car=" + car +
                ", profession='" + profession + '\'' +
                '}';
    }
}
