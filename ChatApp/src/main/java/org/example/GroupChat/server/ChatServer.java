package org.example.GroupChat.server;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    private static Set<ClientHandler> clients = new HashSet<>();

    public static void main(String[] args) {

        startServer();
    }


    private static void startServer() {
        int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Chat Server Started on port " + port);

            while (true) {

                Socket socket = serverSocket.accept();
                handleClient(socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket socket) {

        ClientHandler client = new ClientHandler(socket);

        clients.add(client);
        new Thread(client).start();
    }

    // Broadcast message to all clients
    public static void broadcast(String message, ClientHandler sender) {

        for (ClientHandler client : clients) {

            if (client != sender) {
                client.sendMessage(sender.username+": "+message);
            }
        }
    }

    // Remove disconnected client
    public static void removeClient(ClientHandler client) {
        clients.remove(client);
    }
}
