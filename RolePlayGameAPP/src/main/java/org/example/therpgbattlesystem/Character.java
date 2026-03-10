package org.example.therpgbattlesystem;

import java.io.Serializable;
import java.util.Random;

public abstract class Character implements Serializable {
    protected String name;
    protected int health;
    protected int strength;
    protected Random random =  new Random();

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
