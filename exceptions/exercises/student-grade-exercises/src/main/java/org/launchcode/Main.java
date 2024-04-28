package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(10, 2)); //Should print 5
        System.out.println(Divide(10, 0)); //Should throw an exception

        //existing code for initializing studentFiles HashMap
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y) {

   try  {
       if (y == 0) {
           throw new ArithmeticException("Cannot divide by zero!");
       }
       return x / y;
   } catch (ArithmeticException e) {
       System.out.println("Error: " + e.getMessage());
       return 0;
         }
    }

    public static int CheckFileExtension(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("File name is null or empty.");
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
      }
    }
}

