package org.example.groupchat.websocket;

import org.java_websocket.server.WebSocketServer;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;

import java.net.InetSocketAddress;
import java.util.*;

public class WebSocketGateway extends WebSocketServer {

    private Map<WebSocket,String> users = new HashMap<>();

    public WebSocketGateway(int port) {
        super(new InetSocketAddress(port));
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        System.out.println("Browser client connected");
    }

    @Override
    public void onMessage(WebSocket conn, String message) {

        if(message.startsWith("JOIN:")){

            String username = message.substring(5).trim();

            // check duplicate
            if(users.containsValue(username)){
                conn.send("SYSTEM: Username already taken");
                return;
            }

            users.put(conn, username);

            broadcast("SYSTEM: " + username + " joined the chat");

            sendUserList();
        }
        else{
            broadcast(message);
        }
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {

        String user = users.get(conn);

        if(user!=null){

            broadcast("SYSTEM: "+user+" left the chat");

            users.remove(conn);

            sendUserList();
        }
    }

    private void sendUserList(){

        String list = "USERS:"+String.join(",",users.values());

        for(WebSocket client:users.keySet()){

            client.send(list);

        }
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        ex.printStackTrace();
    }

    @Override
    public void onStart() {
        System.out.println("WebSocket server running on port 8080");
    }

    public static void main(String[] args) {

        WebSocketGateway server = new WebSocketGateway(8080);

        server.start();

    }
}
