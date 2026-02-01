package com.kovanlabs.intern.java.fridaychallenge;

public class Enigma {
    private static String encrypt(String message, int key){
        StringBuilder encrypted = new StringBuilder();

        for(char ch : message.toCharArray()){
            encrypted.append((char) (ch^key));
        }
        return encrypted.toString();
    }

    private static String decrypt(String cipher, int key){
        StringBuilder decrypted = new StringBuilder();

        for(char ch : cipher.toCharArray()){
            decrypted.append((char) (ch^key));
        }
        return decrypted.toString();
    }

    public static void main(String[] args){
        String message = "Hello Enigma";
        int key = 100;
        String encrypt = encrypt(message, key);
        String decrypt = decrypt(encrypt, key);

        System.out.println("Original: "+ message);
        System.out.println("Encrypted: "+ encrypt);
        System.out.println("Decrypted: "+ decrypt);
    }
}
