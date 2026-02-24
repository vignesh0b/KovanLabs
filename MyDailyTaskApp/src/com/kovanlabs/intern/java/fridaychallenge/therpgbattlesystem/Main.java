package com.kovanlabs.intern.java.fridaychallenge.therpgbattlesystem;

import com.kovanlabs.intern.java.filehandling.LoadGame;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Character p1 = new Warrior("️Deadpool");
        Character p2 =  new Rogue("Wolverine");
        Character p3 = LoadGame.characterLoader("savegame.dat");
        Arena.battle(p1,p3);
        System.out.println("testingg git");
    }
}
