package com.kovanlabs.intern.java.oop.inheritance;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    int legs = 4;
    public void sound(){
        System.out.println("Animal makes sound");
    }

}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
        super.legs=3;
    }

}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat meow");
    }

}
