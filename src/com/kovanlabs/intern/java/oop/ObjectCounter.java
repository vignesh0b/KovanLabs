package com.kovanlabs.intern.java.oop;

public class ObjectCounter {
    public static int count = 0;


    ObjectCounter() {

    }

    ObjectCounter(int i){

    }

    ObjectCounter(String s){

    }
    {
        count++;
    }

    public static void main(String[] args){
        ObjectCounter c1 = new ObjectCounter();
        ObjectCounter c2 = new ObjectCounter(5);
        ObjectCounter c3 = new ObjectCounter("vignesh");

        System.out.println(ObjectCounter.count);
        System.out.println(c1.count);


    }
}
