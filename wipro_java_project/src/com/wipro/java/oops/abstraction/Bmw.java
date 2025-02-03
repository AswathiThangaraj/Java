package com.wipro.java.oops.abstraction;

public class Bmw extends Car {
    @Override
    public void brandName() {
        System.out.println("The brand name is BMW");
    }

    @Override
    public void manufactureYear() {
        System.out.println("The manufacture year is 2018");
    }

    public static void main(String[] args) {
        Car myCar = new Bmw(); 
        myCar.brandName();  
        myCar.manufactureYear();  
    }
}