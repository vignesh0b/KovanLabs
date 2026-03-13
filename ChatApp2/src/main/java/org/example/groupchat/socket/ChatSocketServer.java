package org.example.groupchat.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatSocketServer {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(5000);

        System.out.println("Socket Chat Server running on port 5000");

        while(true){

            Socket socket = serverSocket.accept();

            new Thread(new SocketClientHandler(socket)).start();

        }
    }
}
