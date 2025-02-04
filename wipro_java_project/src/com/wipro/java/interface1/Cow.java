package com.wipro.java.interface1;

public class Cow implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Humba");
	}
	
	public static void main(String a[]) {
		Animal cow1 = new Cow();
		cow1.makeSound();
	}
}
