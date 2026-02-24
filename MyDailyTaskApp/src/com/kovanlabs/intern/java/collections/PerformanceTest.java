package com.kovanlabs.intern.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceTest {
    public static void main(String[] args){
        ArrayList<Integer> alist = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        int n=1000000;
        int middle = n/2;
        for(int i=0; i<n; i++){
            list.add(i+1);
            alist.add(i+1);
        }

        long startLinked = System.nanoTime();
        int value = list.get(middle);
        long endLinked = System.nanoTime();
        System.out.println("For Linked list: star-"+startLinked+ "   End-"+endLinked);

        long startArray = System.nanoTime();
        int value2 = alist.get(middle);
        long endArray = System.nanoTime();
        System.out.println("For array list : star-"+startArray+ "   End-"+endArray);
        System.out.println(alist.equals(list));

    }
}
