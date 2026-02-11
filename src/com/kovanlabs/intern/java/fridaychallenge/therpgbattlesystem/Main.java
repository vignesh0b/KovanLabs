package com.kovanlabs.intern.java.fridaychallenge.therpgbattlesystem;

public class Main {
    public static void main(String[] args){
        Character p1 = new Warrior("️Deadpool");
        Character p2 =  new Rogue("Wolverine");
        Arena.battle(p1,p2);
    }
}
