/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class ExceptionExample {
	static int num = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
		try {
			if (num % 10 == 0) {
                System.out.println("The number " + num + " is divisible by 10.");
            } else {
                System.out.println("The number " + num + " is not divisible by 10.");
            }
		}
		catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Execution done.");
        }
	}

}
