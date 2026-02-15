package com.kovanlabs.intern.java.exceptionhandling;

public class Main {
    public static void main(String[] args){
        FileProcessor fr = new FileProcessor();

        try{
            fr.readFile("text.txt");
        }
        catch (DataProcessingException e){
            System.out.println(e.getMessage());
        }
    }
}
