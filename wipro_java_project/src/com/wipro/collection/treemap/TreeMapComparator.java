package com.wipro.collection.treemap;

// Importing required classes
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator {

    // Class 1
    // Helper class representing Student
    static class Student {
        int rollno;
        String name, address;

        public Student(int rollno, String name, String address) {
            this.rollno = rollno;
            this.name = name;
            this.address = address;
        }

        public String toString() {
            return this.rollno + " " + this.name + " " + this.address;
        }
    }

    // Class 2
    // Helper class - Comparator implementation
    static class Sortbyroll implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.rollno - b.rollno;
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("TreeMap using TreeMap(Comparator) constructor:\n");

        TreeMap<Student, Integer> tree_map = new TreeMap<>(new Sortbyroll());

        tree_map.put(new Student(111, "bbbb", "london"), 2);
        tree_map.put(new Student(131, "aaaa", "nyc"), 3);
        tree_map.put(new Student(121, "cccc", "jaipur"), 1);

        System.out.println("TreeMap: " + tree_map);
    }
}