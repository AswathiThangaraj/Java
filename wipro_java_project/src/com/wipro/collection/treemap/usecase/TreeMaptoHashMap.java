package com.wipro.collection.treemap.usecase;

import java.util.*;

public class TreeMaptoHashMap {
    public static void main(String[] args) {
        // Step 1: Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        // Adding some data to TreeMap
        treeMap.put(1, "Apple");
        treeMap.put(2, "Mango");
        treeMap.put(3, "Pineapple");
        treeMap.put(4, "Grapes");
        //Print TreeMap
        System.out.println("Original TreeMap: " + treeMap);
        
        // Step 2: Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Step 3: Iterate over TreeMap and put data into HashMap
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        
        // Step 4: Display the contents of HashMap
        System.out.println("Contents of HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}