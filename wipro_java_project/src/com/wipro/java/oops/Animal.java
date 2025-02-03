/**
 * 
 */
package com.wipro.java.oops;

/**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fields
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/

public class Animal {
	private String animal_name; //name of animal
	private String animal_color; //name of color
	private String animal_variety; //name of variety
	private int animal_age; // age
	
	// get animal name
	public String getAnimal_name() {
		return animal_name;
	}

	// set a animal name
	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}

	// get animal color
	public String getAnimal_color() {
		return animal_color;
	}

	// set animal color
	public void setAnimal_color(String animal_color) {
		this.animal_color = animal_color;
	}

	// get animal variety
	public String getAnimal_variety() {
		return animal_variety;
	}

	// set animal variety
	public void setAnimal_variety(String animal_variety) {
		this.animal_variety = animal_variety;
	}

	// set age
	public int getAnimal_age() {
		return animal_age;
	}

	// get age
	public void setAnimal_age(int animal_age) {
		this.animal_age = animal_age;
	}

	 @Override
	    public String toString() {
	        return "Animal{name='" + animal_name + "', age=" + animal_age + ", variety='" + animal_variety + "', color='" + animal_color + "'}";
	    }

	    public static void main(String[] args) {
	        Animal myAnimal = new Animal();
	        myAnimal.setAnimal_name("Dog");
	        myAnimal.setAnimal_color("White");
	        myAnimal.setAnimal_variety("German Shepherd");
	        myAnimal.setAnimal_age(4);
	        System.out.println(myAnimal);
	    }

}
