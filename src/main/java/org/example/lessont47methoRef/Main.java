package org.example.lessont47methoRef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task 1
        List<String> list = List.of("G", "A", "B", "C", "D", "E", "enough");
        list.forEach(System.out::println);
        //Task 2
        list.forEach(Main::print);

    }
    public static void print(String s){
        System.out.println(s);
    }
}
