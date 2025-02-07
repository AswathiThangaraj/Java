package com.wipro.java.java8;

public class StringApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Name xyz";
		System.out.println(str.length()); //finding length
		System.out.println(str.charAt(2)); //finding character at index
		System.out.println(str.substring(1, 3)); //finding substring start from 1 to n-1
		System.out.println(str.contains("a")); //contains alphabet
		String[] a=str.split(" "); //split
		//print
		for (String str1:a) {
			System.out.println(str1);
		}

	}

}
