package org.example.lesson49optional.task3;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cow(),
                new Dog(),
                null,
                new Dog(),
                new Cow(),
                new Cat()
        };

        for(Animal a : animals){
            printSound(a);
        }
    }

    public static void printSound(Animal animal){
        Optional.ofNullable(animal)
                .filter(Cat.class::isInstance)
                .map(Cat.class::cast)
                .map(cat -> cat.sound())
                .or(()->Optional.ofNullable(animal)
                        .filter(Dog.class::isInstance)
                        .map(Dog.class::cast)
                        .map(dog -> dog.sound()))
                .or(()->Optional.ofNullable(animal)
                        .filter(Cow.class::isInstance)
                        .map(Cow.class::cast)
                        .map(cow -> cow.sound()))
                .ifPresent(System.out::println);
    }
}
