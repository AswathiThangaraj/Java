package com.wipro.java.exception;

public class UncheckedException {
    public static void main(String[] args) {
        int number = -10; 

        try {
            if (number < 0) {
                throw new ArithmeticException("Number must be positive.");
            }
            if (number % 2 == 0) {
                System.out.println(number + " is divisible by 2.");
            } else {
                System.out.println(number + " is NOT divisible by 2.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
