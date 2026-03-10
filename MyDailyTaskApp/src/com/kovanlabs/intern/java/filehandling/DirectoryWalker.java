package com.kovanlabs.intern.java.filehandling;

import java.io.File;

public class DirectoryWalker {
    public static void main(String[] args){
        File folder = new File("C:\\Users\\bvign\\IdeaProjects\\project2\\src");
        listFile(folder);
    }

    private static void listFile(File file) {
        if(file.isFile()){
            System.out.println("File: "+file.getAbsolutePath() + "length: "+file.length());
        }
        else if(file.isDirectory()){
            File[] files = file.listFiles();
            if(files!=null) {
                for (File f : files) {
                    listFile(f);
                }
            }
        }
    }
}
