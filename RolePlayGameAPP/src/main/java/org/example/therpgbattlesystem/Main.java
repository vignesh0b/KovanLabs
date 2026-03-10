package org.example.therpgbattlesystem;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Character p1 = new Warrior("️Deadpool");
        Character p2 =  new Rogue("Wolverine");
        Arena.battle(p1,p2);
    }
}
