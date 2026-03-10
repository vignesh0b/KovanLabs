package com.kovanlabs.intern.java.fridaychallenge.logfileanalyzer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

public class LogGenerator {

    public static void main(String[] args) throws IOException {

        String[] urls = {"/home", "/login", "/products", "/about", "/cart"};
        int[] statusCodes = {200, 200, 200, 404, 500}; // more 200s

        Random random = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("server.log"))) {

            for (int i = 0; i < 10000; i++) {

                String ip = "192.168.1." + random.nextInt(50);
                String time = LocalDateTime.now().toString();
                int status = statusCodes[random.nextInt(statusCodes.length)];
                String url = urls[random.nextInt(urls.length)];

                writer.write(ip + " " + time + " " + status + " " + url);
                writer.newLine();
            }
        }

        System.out.println("Log file generated!");
    }
}

