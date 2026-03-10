package com.kovanlabs.intern.java.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryWalker2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\bvign\\IdeaProjects\\project2\\src");
        Files.walk(filePath)
                .filter(Files :: isRegularFile)
                .forEach(path -> {
                    try{
                        long size = Files.size(path);
                        System.out.println("File: "+path+" Size: "+size);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
}
