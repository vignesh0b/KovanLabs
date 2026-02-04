package com.kovanlabs.intern.java.oop.interfacee.multipleinterface;

public class SmartPhone implements Phone, Camera, MusicPlayer{

    @Override
    public void start() {
        Phone.super.start();
        Camera.super.start();
        MusicPlayer.super.start();
    }

    @Override
    public void call() {
        System.out.println("Ringing... ");
    }

    @Override
    public void click() {
        System.out.println("Captured");
    }

    @Override
    public void play() {
        System.out.println("Music plays");
    }

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.start();

    }
}
