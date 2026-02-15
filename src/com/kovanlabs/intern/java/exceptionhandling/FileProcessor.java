package com.kovanlabs.intern.java.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    public void readFile(String filename){
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new DataProcessingException("Throws Data Processing Exception");
        }
    }
}
