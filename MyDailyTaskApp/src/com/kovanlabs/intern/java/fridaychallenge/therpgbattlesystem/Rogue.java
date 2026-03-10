package com.kovanlabs.intern.java.fridaychallenge.therpgbattlesystem;

public class Rogue extends Character{
    public Rogue(String name) {
        super(name, 115, 18);
    }

    @Override
    public void attack(Character Opponent) {
        int damage = strength+ random.nextInt(3);
        System.out.println(name +" attack for "+damage +" damage!");
        Opponent.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        if(random.nextDouble()<0.2){
            System.out.println(name +" dodged the attack!");
        }
        else{
            super.takeDamage(damage);
        }
    }
}
