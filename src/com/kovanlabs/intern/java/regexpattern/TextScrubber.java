package com.kovanlabs.intern.java.regexpattern;

public class TextScrubber {
    public static void main(String[] args){
        String text = "H3ll0 W0rld! Th1s is J4v4.";
        text = text.replaceAll("[0-9]","*");
        text = text.replaceAll("[!]","");
        System.out.println(text);
    }
}
