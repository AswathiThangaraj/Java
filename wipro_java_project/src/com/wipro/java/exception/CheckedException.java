package com.wipro.java.exception;

    import java.io.File;
    import java.io.FileReader;
    import java.io.FileNotFoundException;

    public class CheckedException {
        public static void main(String[] args) {
            try {
                File file = new File("wrong_file_path.txt"); // Incorrect path
                FileReader reader = new FileReader(file); // throw FileNotFoundException
            } catch (FileNotFoundException e) {
                System.out.println("Checked Exception Caught: " + e);
            }
            System.out.println("Rest of code");
        }
    }
