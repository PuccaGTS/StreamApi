package org.example.lesson49optional;

public class Car {
    int number;
    private Human owner;
    private String color;
    private boolean actualTechnicalInspection;

    public Car(int number, Human owner, String color, boolean actualTechnicalInspection) {
        this.number = number;
        this.owner = owner;
        this.color = color;
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    public Car(int number, String color, boolean actualTechnicalInspection) {
        this.number = number;
        this.color = color;
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Human getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActualTechnicalInspection() {
        return actualTechnicalInspection;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public void setActualTechnicalInspection(boolean actualTechnicalInspection) {
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", owner=" + owner +
                ", color='" + color + '\'' +
                ", actualTechnicalInspection=" + actualTechnicalInspection +
                '}';
    }
}
