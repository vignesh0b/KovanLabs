package org.example.GroupChat.client;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.Socket;

public class ChatClientUI {

    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
    private String username;

    private JFrame frame;
    private JTextArea chatArea;
    private JTextField inputField;

    public ChatClientUI(String host, int port) {
        try {
            username = JOptionPane.showInputDialog("Enter username:");
            socket = new Socket(host, port);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);

            // Send username to server
            writer.println(username);

            buildUI();
            startMessageReader();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void buildUI() {
        frame = new JFrame("Chat - " + username);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();
        inputField.addActionListener(e -> {
            String msg = inputField.getText();
            if (!msg.trim().isEmpty()) {
                writer.println(msg);                        // send to server
                chatArea.append(username + ": " + msg + "\n"); // show locally
                inputField.setText("");
            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputField, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void startMessageReader() {
        new Thread(() -> {
            String msg;
            try {
                while ((msg = reader.readLine()) != null) {
                    chatArea.append(msg + "\n");
                }
            } catch (IOException e) {
                chatArea.append("Disconnected from server.\n");
            }
        }).start();
    }

    public static void main(String[] args) {
        new ChatClientUI("localhost", 5000);
    }
}
