package com.wipro.java.oops.polymorphism;

public class Fruits {
	private String fruitName;
	private String color;
	private String variety;
	private float price;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void show() {
		System.out.println("Fruit name is: " + fruitName);
	}

}
