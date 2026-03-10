package com.kovanlabs.intern.java.oop.inheritance;

public class CovariantReturn {
    public static void main(String[] args){
        Car car = new Car();
        Toyota toyota1 = new Toyota();
        Car toyota2 = toyota1.getCar();


    }
}
class Car{
    Car getCar(){
        return new Car();
    }
    void message(){
        System.out.println("Its a car");
    }
}

class Toyota extends Car{
    Car getCar(){
        return new Toyota();  //covariant return type
    }
    void message(){
        System.out.println("Its toyota car");
    }
}
