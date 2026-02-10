package com.kovanlabs.intern.java.collections;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(!(object instanceof Person)){
            return false;
        }

        return name.equals(((Person) object).name) && age == ((Person) object).age;
    }


//    @Override
//    public int hashCode(){
//        return name.hashCode()+age;
//    }
}
