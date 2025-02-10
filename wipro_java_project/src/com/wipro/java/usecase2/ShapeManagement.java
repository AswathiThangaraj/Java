package com.wipro.java.usecase2;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ShapeManagement {
    public static void main(String[] args) {
        ShapeService service = new ShapeService();
        Scanner scanner = new Scanner(System.in);

        // Adding some shapes for testing
        service.addShape(new Circle("Red", 5));
        service.addShape(new Rectangle("Blue", 4, 6));
        service.addShape(new Circle("Green", 7));

        while (true) {
            System.out.println("\n------ Shape Management System ------");
            System.out.println("1. Add Shape");
            System.out.println("2. Remove Shape");
            System.out.println("3. Search Shape");
            System.out.println("4. Display All Shapes");
            System.out.println("5. Filter by Color");
            System.out.println("6. Sort by Area");
            System.out.println("7. Get Average Area");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Shape Type (Circle/Rectangle): ");
                    scanner.nextLine();  
                    String type = scanner.nextLine();
                    System.out.print("Enter Color: ");
                    String color = scanner.nextLine();
                    if (type.equalsIgnoreCase("Circle")) {
                        System.out.print("Enter Radius: ");
                        double radius = scanner.nextDouble();
                        service.addShape(new Circle(color, radius));
                    } else if (type.equalsIgnoreCase("Rectangle")) {
                        System.out.print("Enter Length: ");
                        double length = scanner.nextDouble();
                        System.out.print("Enter Width: ");
                        double width = scanner.nextDouble();
                        service.addShape(new Rectangle(color, length, width));
                    } else {
                        System.out.println("Invalid Shape Type!");
                    }
                    break;
                case 2:
                    System.out.print("Enter Shape Name to Remove: ");
                    scanner.nextLine();
                    String removeName = scanner.nextLine();
                    service.removeShape(removeName);
                    break;
                case 3:
                    System.out.print("Enter Shape Name to Search: ");
                    scanner.nextLine();
                    String searchName = scanner.nextLine();
                    Optional<Shape> foundShape = service.searchShape(searchName);
                    System.out.println(foundShape.orElse(null));
                    break;
                case 4:
                    service.displayShapes();
                    break;
                case 5:
                    System.out.print("Enter Color: ");
                    scanner.nextLine();
                    String filterColor = scanner.nextLine();
                    List<Shape> filteredShapes = service.filterByColor(filterColor);
                    filteredShapes.forEach(System.out::println);
                    break;
                case 6:
                    List<Shape> sortedShapes = service.sortByArea();
                    sortedShapes.forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("Average Area: " + service.getAverageArea());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}