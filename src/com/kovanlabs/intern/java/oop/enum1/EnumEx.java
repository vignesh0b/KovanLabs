package com.kovanlabs.intern.java.oop.enum1;

import java.util.Arrays;

public class EnumEx {
    public static void main(String[] args){
        Week day2 = Week.MONDAY;
        Week day6 = Week.FRIDAY;
        System.out.println(day2);
        System.out.println(day6);
        //enum with switch
        switch(day2){
            case MONDAY:
                System.out.println("Start work");
                break;
            case FRIDAY:
                System.out.println("Weekend coming");
                break;
        }

        //enum with constructor and methods
        Color c = Color.BLUE;
        c.display();
        System.out.println(day.SUNDAY.display());
        System.out.println(Arrays.toString(Week.values()));

    }
}
enum Week{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
//Constructor and Methods
enum Color{
    RED, BLUE, GREEN;

    Color(){
        System.out.println("Constructor called "+this);
    }

    void display(){
        System.out.println("Method called "+this);
    }
}
// abstract methods
enum day{
    SUNDAY{
        public String display(){
            return "day 1";
        }
    },
    MONDAY{
        public String display(){
            return "day 2";
        }
    };
    public abstract String display();
}
