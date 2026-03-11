package org.example.GroupChat.server;

import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {

    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;

    public ClientHandler(Socket socket) {
        this.socket = socket;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            writer = new PrintWriter(socket.getOutputStream(), true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        String message;

        try {

            while ((message = reader.readLine()) != null) {

                System.out.println("Message: " + message);

                ChatServer.broadcast(message, this);
            }

        } catch (IOException e) {
            System.out.println("Client disconnected");

        } finally {
            closeConnection();
        }
    }

    public void sendMessage(String message) {
        writer.println(message);
    }

    private void closeConnection() {

        try {

            ChatServer.removeClient(this);

            if (socket != null)
                socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
