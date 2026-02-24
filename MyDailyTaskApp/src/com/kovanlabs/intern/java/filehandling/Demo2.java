package com.kovanlabs.intern.java.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\bvign\\KovanLabs\\java\\WeeklyTask\\src\\com\\kovanlabs\\intern\\java\\filehandling\\myFile.txt";
        Path path = Paths.get(filename);
        Files.writeString(path, "hello all");
        String data = Files.readString(path);
        System.out.println(data);
    }
}
