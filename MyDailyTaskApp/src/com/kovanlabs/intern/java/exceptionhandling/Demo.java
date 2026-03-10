package com.kovanlabs.intern.java.exceptionhandling;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {

            if (age < 18) {
                throw new AgeLimitException("Age must be over 18");
            }
        } catch (AgeLimitException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("hello");
    }
}
