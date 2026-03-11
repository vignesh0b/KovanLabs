package org.example.GroupChat.client;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {

        String host = "localhost";
        int port = 5000;

        try {

            Socket socket = new Socket(host, port);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter writer = new PrintWriter(
                    socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            // Thread to read messages
            new Thread(() -> {
                String msg;
                try {
                    while ((msg = reader.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server");
                }
            }).start();

            // Send messages
            while (true) {
                String message = scanner.nextLine();
                writer.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
