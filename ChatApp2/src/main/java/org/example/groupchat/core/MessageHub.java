package org.example.groupchat.core;

import java.util.ArrayList;
import java.util.List;

public class MessageHub {

    public interface ClientConnection {
        void send(String message);
    }

    private static final List<ClientConnection> clients = new ArrayList<>();

    public static synchronized void register(ClientConnection client) {
        clients.add(client);
    }

    public static synchronized void remove(ClientConnection client) {
        clients.remove(client);
    }

    public static synchronized void broadcast(String message) {

        for (ClientConnection client : clients) {
            client.send(message);
        }
    }
}