package com.kovanlabs.intern.java.basics;

public class diamondPrinter {


    public static void main(String[] args){
        printer(7);
    }

    private static void printer(int n){
        if(n%2 == 0){
            System.out.println("Enter only odd number");
            return;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0; i<n-1; i++){

            for(int k=0; k<=i; k++){
                System.out.print(" ");
            }

            for(int j=0; j<n-i-1; j++){
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
