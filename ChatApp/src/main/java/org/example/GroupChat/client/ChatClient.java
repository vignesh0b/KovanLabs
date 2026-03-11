package org.example.GroupChat.client;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {

    private static Socket socket;
    private static BufferedReader reader;
    private static PrintWriter writer;

    public static void main(String[] args) {
        startClient();

    }

    private static void startClient(){
        int port = 5000;
        String host = "localhost";
        String username;
        try {
            System.out.println("Enter username: ");
            username = new Scanner(System.in).nextLine();
            connectToServer(host, port);
            startMessageReading();
            sendMessage(username);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    private static void connectToServer(String host, int port) throws IOException {
        socket = new Socket(host, port);
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        System.out.println("Connected to server");
    }

    private static void startMessageReading(){
        new Thread(
                ()->{
                    String msg;
                    try{
                        while((msg = reader.readLine())!= null){
                            System.out.println(msg);
                        }
                    }
                    catch(IOException e){
                        System.out.println("Disconnected from the server!");
                    }
                }
        ).start();
    }

    private static void sendMessage(String username){
        Scanner sc = new Scanner(System.in);
        writer.println(username);
        while(true){
            writer.println(sc.nextLine());
        }
    }


}
