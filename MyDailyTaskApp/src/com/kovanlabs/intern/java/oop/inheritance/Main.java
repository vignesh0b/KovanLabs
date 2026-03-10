package com.kovanlabs.intern.java.oop.inheritance;

public class Main {
    public static void main(String[] args){
//        Animal animal = new Animal();
//        animal.sound();
//        Animal dog = new Dog();
//        dog.sound();

        SubClass s = new SubClass("Arthur Morgan", 35);
        System.out.println(s.name+" "+s.age);
        s.greetings();
    }
}
