package com.wipro.java.collection;
import java.util.*;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		
		//add items to list l1
		l1.add(0, 1);
		l1.add(1, 2);
		l1.add(2, 3);
		System.out.println(l1);
		
		//add items to list l2
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		//joining items of l2 in l1 at index position 1
		l1.addAll(1, l2);
		System.out.println(l1);
		
		//removing item of index 1
		l1.remove(1);
		System.out.println(l1);
		
		//get value at index position of 3
		System.out.println(l1.get(3));
		
		//set value at index position 0 as 5
		l1.set(0, 5);
		
		System.out.println(l1);
		
	}

}
