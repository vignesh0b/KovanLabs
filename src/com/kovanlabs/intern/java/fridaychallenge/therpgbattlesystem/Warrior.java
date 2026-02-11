package com.kovanlabs.intern.java.fridaychallenge.therpgbattlesystem;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name, 150, 15);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(5);
        System.out.println(name + " slashes for "+damage +" damage");
        opponent.takeDamage(damage);
    }
}
