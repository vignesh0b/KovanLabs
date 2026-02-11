package com.kovanlabs.intern.java.fridaychallenge.therpgbattlesystem;

public class Arena {
    public static void battle(Character p1, Character p2){
        System.out.println("⚔️ Battle Begins!!!");
        System.out.println("Player 1: "+p1);
        System.out.println("️️Player 2: "+p2);
        System.out.println();

        while(p1.isAlive() && p2.isAlive()){
            p1.attack(p2);
            System.out.println(p2);
            if(!p2.isAlive()){
                break;
            }
            p2.attack(p1);
            System.out.println(p1);

            System.out.println("-----------------------------");
        }
        System.out.println("🏆Battle over!!!");
        if(p1.isAlive()){
            System.out.println(p1 +" Wins");
        }
        else {
            System.out.println(p2 +" Wins");
        }
    }
}
