package org.example.GroupChat.server;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    private static Set<ClientHandler> clients = new HashSet<>();

    public static void main(String[] args) {

        int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {

            System.out.println("Chat Server Started on port " + port);

            while (true) {

                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                ClientHandler client = new ClientHandler(socket);

                clients.add(client);
                new Thread(client).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Broadcast message to all clients
    public static void broadcast(String message, ClientHandler sender) {

        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
    }

    // Remove disconnected client
    public static void removeClient(ClientHandler client) {
        clients.remove(client);
    }
}
