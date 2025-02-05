package com.wipro.java.collection;

public class Arrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare array
		int[] arr;
		//allocate memory
		arr = new int[5];
		//initializing values
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//itearation of arr 0 to 4
		for (int i=0; i<arr.length; i++) {
			System.out.println("Element at index" + i + ":" + arr[i]);
		}
	}

}
