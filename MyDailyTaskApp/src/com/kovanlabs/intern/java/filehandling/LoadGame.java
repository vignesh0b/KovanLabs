package com.kovanlabs.intern.java.filehandling;

import com.kovanlabs.intern.java.fridaychallenge.therpgbattlesystem.Mage;

import java.io.*;

public class LoadGame {


    public static Mage  characterLoader(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fip = new FileInputStream(filename);
        ObjectInputStream oip = new ObjectInputStream(fip);
        return (Mage)oip.readObject();
    }
}