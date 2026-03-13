package org.example.groupchat.socket;

import org.example.groupchat.core.MessageHub;

import java.io.*;
import java.net.Socket;

public class SocketClientHandler implements Runnable, MessageHub.ClientConnection {

    private Socket socket;
    private PrintWriter writer;

    public SocketClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));

            writer = new PrintWriter(socket.getOutputStream(), true);

            MessageHub.register(this);

            String message;

            while((message = reader.readLine()) != null){

                MessageHub.broadcast(message);

            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void send(String message) {

        writer.println(message);

    }
}
