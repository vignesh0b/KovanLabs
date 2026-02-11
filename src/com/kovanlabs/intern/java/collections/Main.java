package com.kovanlabs.intern.java.collections;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        Person p1 = new Person("Kumar",25);
        Person p2 = new Person("Kumar",25);
        HashMap<Person, Integer> map1 = new HashMap<>();
        map1.put(p1,1);
        map1.put(p2,2);
        System.out.println(map1.get(p1));
        System.out.println(map1.get(p2));
        System.out.println(p1.equals(p2));


    }
}
