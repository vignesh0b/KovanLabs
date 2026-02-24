package com.kovanlabs.intern.java.filehandling;

import com.kovanlabs.intern.java.fridaychallenge.therpgbattlesystem.Mage;

import java.io.*;

public class SaveGame {
    public static void main(String[] args) throws IOException {
        Mage mage = new Mage("Doctor Strange");
        FileOutputStream fos = new FileOutputStream("savegame.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(mage);
        oos.close();

    }
}
