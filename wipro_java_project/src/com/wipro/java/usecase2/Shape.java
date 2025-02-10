package com.wipro.java.usecase2;

import java.util.*;
import java.util.stream.Collectors;

// Abstract class for Shape
abstract class Shape {
    private String name;
    private String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();  // Abstract method

    @Override
    public String toString() {
        return name + " (Color: " + color + ", Area: " + getArea() + ")";
    }
}

// Circle Class (Inheriting Shape)
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle Class (Inheriting Shape)
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(String color, double length, double width) {
        super("Rectangle", color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}