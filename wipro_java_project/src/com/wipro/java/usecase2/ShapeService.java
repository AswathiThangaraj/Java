package com.wipro.java.usecase2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class ShapeService {
    private List<Shape> shapes = new ArrayList<>();

    // Add a shape
    public void addShape(Shape shape) {
        shapes.add(shape);
        System.out.println(shape.getName() + " added: " + shape);
    }

    // Remove a shape by name
    public void removeShape(String name) {
        shapes.removeIf(shape -> shape.getName().equalsIgnoreCase(name));
        System.out.println(name + " removed from the list.");
    }

    // Search Shape by name
    public Optional<Shape> searchShape(String name) {
        return shapes.stream()
                .filter(shape -> shape.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    // Display All Shapes
    public void displayShapes() {
        shapes.forEach(System.out::println);
    }

    // Filter Shapes by Color
    public List<Shape> filterByColor(String color) {
        return shapes.stream()
                .filter(shape -> shape.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    // Sort Shapes by Area
    public List<Shape> sortByArea() {
        return shapes.stream()
                .sorted(Comparator.comparing(Shape::getArea))
                .collect(Collectors.toList());
    }

    // Get Average Area of Shapes
    public double getAverageArea() {
        return shapes.stream()
                .mapToDouble(Shape::getArea)
                .average()
                .orElse(0.0);
    }
}