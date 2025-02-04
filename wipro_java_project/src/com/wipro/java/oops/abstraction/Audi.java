package com.wipro.java.oops.abstraction;

public class Audi extends Car {
	@Override
    public void brandName() {
        System.out.println("The brand name is Audi");
    }

    @Override
    public void manufactureYear() {
        System.out.println("The manufacture year is 2024");
    }

    public static void main(String[] args) {
        Car myCar1 = new Audi(); 
        myCar1.brandName();  
        myCar1.manufactureYear();  
    }
}