package org.example.lesson49optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Appartment appartment1 = new Appartment("улица Гоголя, дом 18, квартира 5");
        Appartment appartment2 = new Appartment("улица Лермонтова, дом 98, квартира 54");
        Appartment appartment4 = new Appartment("улица Рублевское шосе, дом 18, квартира 5");

        Human human1 = new Human("Олег", appartment1, "Маляр");
        Human human2 = new Human("Света", appartment1, "Учитель");

        Car car1 = new Car(2020, "red", true);
        Car car2 = new Car(1999, "pink", false);
        Car car3 = new Car(2019, "blue", true);
        Car car4 = new Car(2020, "white", false);

        human1.setCar(car1);
        car1.setOwner(human1);
        human2.setCar(car2);
        car2.setOwner(human2);

        Human child1 = new Human("Олежка", human2, human1, null, appartment2, car3, "военный");
        Human child2 = new Human("Светка", human2, human1, null, appartment4, car4, "Спортсмен");
        Human[] children = {child1, child2};

        human1.setChildren(children);
        human2.setChildren(children);

        String s = Optional.ofNullable(car1)
                .filter(car -> car.getNumber() < 2021)
                .or(() -> null)
                .map(Car::getOwner)
                .filter(human -> !(human.getProfession().equals("полицеский") || human.getChildren()[0].getProfession().equals("полицеский")))
                .or(() -> null)
                .map((Human human) -> human.getChildren()[0])
                .map(Human::getAppartment)
                .filter(appartment -> !(appartment.getAddress().contains("Рублевское шоссе")))
                .or(() -> null)
                .map(Appartment::getAddress)
                .orElse(null);

        System.out.println(s);
    }

}
