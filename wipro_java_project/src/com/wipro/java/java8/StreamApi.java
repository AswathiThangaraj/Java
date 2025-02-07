package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define the list of names
		List<String> list = Arrays.asList("Pratik", "Rahul", "Manikanta");
		//Find name that starts with "P"
		List<String> stream = list.stream().filter(name->name.startsWith("P")).
				collect(Collectors.toList());
		//print
		System.out.println(stream);
		//Change to upper case
		List<String> stream1=list.stream().
				map(String::toUpperCase).
				collect(Collectors.toList());
		//print
		System.out.println(stream1);

	}

}
