package com.kovanlabs.intern.java.fridaychallenge.therpgbattlesystem;

import java.util.Random;

public class Mage extends Character{
    public Mage(String name) {
        super(name, 100, 25);
    }

    @Override
    public void attack(Character Opponent) {
        int damage = strength+random.nextInt(5);
        System.out.println(name + " cast spell for "+damage +" damage");
        Opponent.takeDamage(damage);
    }
}
