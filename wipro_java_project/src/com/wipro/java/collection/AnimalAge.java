package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//comparator
public class AnimalAge implements Comparator<Animal1> {
	public int compare(Animal1 a1, Animal1 a2) {
		return Integer.compare(a1.getAge(), a2.getAge());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal1> a1 = new ArrayList<>();
		a1.add(new Animal1("Dog", 5));
        a1.add(new Animal1("Cat", 3));
        a1.add(new Animal1("Elephant", 10));
		
        //sorting AnimalAge
		Collections.sort(a1, new AnimalAge());
		
		//after sorting print age
		System.out.println("Animal sorted by age:");
		for (Animal1 a : a1 ) {
			System.out.println(a.getName() + " " + a.getAge() + " " );
		}

	}

}
