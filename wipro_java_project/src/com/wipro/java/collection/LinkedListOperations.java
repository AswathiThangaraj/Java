package com.wipro.java.collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		List<Integer> l1 = new LinkedList<Integer>();
		//iterating n values
		for (int i=1; i<=n; i++) {
			l1.add(i);  //adding values in l1
		}
		System.out.println(l1); //print l1
		
		l1.remove(3); //remove value at index 3
		
		System.out.println(l1);
		
		//print element one by one
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i) + " ");
		}

	}

}
