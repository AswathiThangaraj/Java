package com.wipro.java.collection;
import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a hashmap where integer is the key and string is the value
		Map<Integer, String> map = new HashMap<>();
		//adding key-value pairs to the map
		map.put(1,  "BMW");
		map.put(2,  "Audi");
		map.put(3,  "Ford");
		map.put(4,  "Maruthi");
		
		//accessing values
		System.out.println("Key 1: " + map.get(1));
		System.out.println("Key 2: " + map.get(2));
		
		//check if key exists
		if(map.containsKey(3)) {
			System.out.println("Key 3 exists with value: " + map.get(3));
		}

		//iterating over the map using for loop
		System.out.println("\nIterating through the map:");
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		//remove key value pair at index 2
		map.remove(2);
		
		//display map after removal
		System.out.println("\nMap after removal of key 2:");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
