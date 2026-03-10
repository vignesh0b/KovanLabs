package com.kovanlabs.intern.java.oop.composition;

public class Main {
    public static void main(String[] args){
        Computer computer = new Computer(new AmdProcessor(), new Amd08Ram(), new Samsung256Storage());
        computer.spec();
        computer.upgradeRam(new Amd16Ram());
        computer.spec();
    }
}
