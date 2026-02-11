package com.kovanlabs.intern.java.fridaychallenge.therpgbattlesystem;

import java.util.Random;

public abstract class Character {
    protected String name;
    protected int health;
    protected int strength;
    Random random =  new Random();

    Character(String name, int health, int strength){
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void takeDamage(int damage){
        health -= damage;
        if(health<0){
            health = 0;
        }
    }

    public abstract void attack(Character Opponent);


    @Override
    public String toString(){
        return name+ "[ Health: "+health+" ]";
    }

}
