package com.wipro.java.oops.polymorphism;

public class Orange extends Fruits {

	@Override
    public void show() {
        System.out.println("Fruit name is: " + getFruitName() + ", " + "Color is:" + " " + getColor() + ", " + "Variety is:" + " " + getVariety() + ", " + "Price is:" + " " + getPrice());
    }

    public static void main(String a[]) {
        Fruits orange1 = new Orange();
        orange1.setFruitName("Orange");
        orange1.setColor("Orange");
        orange1.setVariety("Kamala");
        orange1.setPrice(56.03f);
        orange1.show();
    }

}
