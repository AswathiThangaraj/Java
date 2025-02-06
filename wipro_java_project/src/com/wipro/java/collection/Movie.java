package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{
	private String n; //movie name
	private double r; //movie rating
	private int y; //release year of movie

	//constructor
	public Movie(String n, double r, int y) {
		this.n = n;
		this.r = r;
		this.y = y;
	}
 
	//sort rating by ascending
	public int compareTo(Movie m) {
		return Double.compare(this.r, m.r);
	}

	//getter method
	public String getName() {
		return n;
	}
	
	public double getRating() {
		return r;
	}
	
	public int getYear() {
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> l = new ArrayList<>();
		l.add(new Movie("Star Wars", 8.7, 1977));
		l.add(new Movie("Empire Strikes Back", 8.8, 1980));
		l.add(new Movie("Return of the Jedi", 8.4, 1983));
		
		Collections.sort(l); //sorting
		
		//print after sorting of rating
		System.out.println("Movies after sorting by rating:");
		for (Movie m : l) {
			System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
		}

	}

}
