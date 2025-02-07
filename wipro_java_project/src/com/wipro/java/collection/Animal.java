package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Animal implements Comparable<Animal> {
    private String name; // animal name
    private int age; // animal age
    private String color; //color

    // Constructor
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Sort by rating in ascending order
    public int compareTo(Animal a) {
        return Integer.compare(this.age, a.age);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Animal("Dog", 5, "Brown"));
        list.add(new Animal("Cat", 3, "White"));
        list.add(new Animal("Elephant", 10, "Gray"));

        Collections.sort(list); // Sorting

        // Print after sorting
        System.out.println("Animals after sorting by age:");
        for (Animal a : list) {
            System.out.println(a.getName() + " " + a.getAge() + " " + a.getColor());
        }
    }
}

