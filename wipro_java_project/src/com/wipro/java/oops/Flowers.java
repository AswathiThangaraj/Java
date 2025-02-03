/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flowers {
	String colorValue;
	String fragranceValue;
	String varietiesValue;

	/**
	 * 
	 */
	Flowers(String color, String fragrance, String varieties) {
		// TODO Auto-generated constructor stub
		this.colorValue = color;
		this.fragranceValue = fragrance;
		this.varietiesValue = varieties;
	}
	
	void show() {
		System.out.println("Flower color is"+ " " + colorValue + ", " + "fragrance is" + " " + fragranceValue + ", " + "varieties is" + " " + varietiesValue);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flowers flower1 = new Flowers("Pink", "Sweet", "Rose");
		Flowers flower2 = new Flowers("White", "Sweet", "Lily");
		flower1.show();
		flower2.show();
	}

}
