package com.kovanlabs.intern.java.oop;

public class EnumEx {
    public static void main(String[] args){
        Day day = Day.MONDAY;
        System.out.println(day);
        switch(day){
            case SUNDAY -> System.out.println("hello its sunday");
            case MONDAY -> System.out.println("hello its monday");
            case TUESDAY -> System.out.println("hello its TUESDAY");
            case WEDNESDAY -> System.out.println("hello its WEDNESDAY");
            default -> System.out.println("its default");
        }
    }
}
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
