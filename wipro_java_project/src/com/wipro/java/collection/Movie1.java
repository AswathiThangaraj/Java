package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Movie1 {
	//fields
	private String n;
	private double r;
	private int y;

	//constructor
	public Movie1(String n, double r, int y) {
		this.n = n;
		this.r = r;
		this.y = y;
	}
	
	//getter
	public String getN() {
		return n;
	}
	
	public double getR() {
		return r;
	}
	
	public int getY() {
		return y;
	}
}
