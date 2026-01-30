package com.kovanlabs.intern.java.regexpattern;

public class StringBuilderExercise {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();  //string builder is mutable
        sb.append("hello");                      //it doesn't create a new object like string for every modification
        System.out.println(sb);
        sb.append(' ');
        sb.append("everyone");
        sb.replace(0,1,"H");
        System.out.println(sb);



    }
}
