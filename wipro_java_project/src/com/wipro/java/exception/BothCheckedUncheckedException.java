package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class BothCheckedUncheckedException {
	
	    public static void main(String[] args) {
	        
	        // checked exception
	        try {
	            File file = new File("wrong_file_path.txt"); // Incorrect path
	            FileReader reader = new FileReader(file); // throws a FileNotFoundException
	        } catch (FileNotFoundException e) {
	            System.out.println("Checked Exception Caught: " + e);
	        }

	        // unchecked exception
	        try {
	            int result = 10 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("Unchecked Exception Caught: " + e);
	        }

	        System.out.println("Rest of the code");
	    }
	}
