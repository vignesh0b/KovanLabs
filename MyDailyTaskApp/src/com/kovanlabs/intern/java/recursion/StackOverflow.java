package com.kovanlabs.intern.java.recursion;

public class StackOverflow {
    static void  show(){
        show();
    }

    public static void main(String[] args){
        show();
    }
}
