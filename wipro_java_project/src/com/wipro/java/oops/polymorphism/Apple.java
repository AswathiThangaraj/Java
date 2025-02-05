package com.wipro.java.oops.polymorphism;

public class Apple extends Fruits {

	@Override
    public void show() {
        System.out.println("Fruit name is: " + getFruitName() + ", " + "Color is:" + " " + getColor() + ", " + "Variety is:" + " " + getVariety() + ", " + "Price is:" + " " + getPrice());
    }

    public static void main(String a[]) {
        Fruits apple1 = new Apple();
        apple1.setFruitName("Apple");
        apple1.setColor("Red");
        apple1.setVariety("Kashmir");
        apple1.setPrice(46.01f);
        apple1.show();
    }

}
