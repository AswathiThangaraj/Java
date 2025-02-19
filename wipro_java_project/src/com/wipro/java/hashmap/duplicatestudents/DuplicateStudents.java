package com.wipro.java.hashmap.duplicatestudents;

import java.util.*;

public class DuplicateStudents {
    public static void main(String[] args) {
        // HashMap to store roll number as key and list of names as value
        HashMap<Integer, List<String>> studentMap = new HashMap<>();

        // Adding 10 students with duplicate names and roll numbers
        addStudent(studentMap, 101, "Aswathi");
        addStudent(studentMap, 102, "Bhava");
        addStudent(studentMap, 103, "Tharini");
        addStudent(studentMap, 101, "Anu"); // Duplicate roll number
        addStudent(studentMap, 104, "Ram");
        addStudent(studentMap, 102, "Raj"); // Duplicate roll number
        addStudent(studentMap, 105, "Julie");
        addStudent(studentMap, 106, "Naveen");
        addStudent(studentMap, 105, "Ivy");   // Duplicate roll number
        addStudent(studentMap, 107, "Jack");

        // Display the HashMap
        for (Map.Entry<Integer, List<String>> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Method to add student to the HashMap
    private static void addStudent(HashMap<Integer, List<String>> map, int rollNumber, String name) {
        map.putIfAbsent(rollNumber, new ArrayList<>());
        map.get(rollNumber).add(name);
    }
}