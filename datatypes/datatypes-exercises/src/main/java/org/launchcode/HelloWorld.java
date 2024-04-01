package org.launchcode;

public class HelloWorld {
}

import java.util.Scanner;

public class HelloWorld {
    public static void main(Stirng[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name?");

        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
