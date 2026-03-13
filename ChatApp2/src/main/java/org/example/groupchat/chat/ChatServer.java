package org.example.groupchat.chat;

import org.java_websocket.server.WebSocketServer;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;

import java.net.InetSocketAddress;
import java.util.*;

public class ChatServer extends WebSocketServer {

    private Map<WebSocket, String> users = new HashMap<>();

    public ChatServer(int port) {
        super(new InetSocketAddress(port));
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        System.out.println("New connection");
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {

        String username = users.get(conn);

        if(username != null){
            broadcast("SYSTEM: " + username + " left the chat");
        }

        users.remove(conn);
        sendUserList();
    }

    @Override
    public void onMessage(WebSocket conn, String message) {

        if(message.startsWith("JOIN:")){

            String username = message.substring(5).trim();

            users.put(conn, username);

            broadcast("SYSTEM: " + username + " joined the chat");

            sendUserList();

        } else {

            broadcast(message);

        }
    }

    private void sendUserList(){

        String userList = "USERS:" + String.join(",", users.values());

        for(WebSocket client : users.keySet()){
            client.send(userList);
        }

    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        ex.printStackTrace();
    }

    @Override
    public void onStart() {
        System.out.println("Server started");
    }

    public static void main(String[] args) {

        ChatServer server = new ChatServer(8080);

        server.start();

        System.out.println("Chat server running on port 8080");

    }
}
