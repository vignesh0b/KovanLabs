package com.kovanlabs.intern.java.oop.inheritance;

public class SuperClass {
    String name;
    int age;
    SuperClass(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void greetings(){
        System.out.println("Hello from superclass");
    }
}
class SubClass extends SuperClass{

    SubClass(String name, int age) {
        super(name, age);
    }

    public void greetings(){
        System.out.println("Hello from subclass");
        super.greetings();
    }


}
