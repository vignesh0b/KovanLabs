package com.kovanlabs.intern.java.fridaychallenge.logfileanalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LogAnalyzer {
    public static void main(String[] args) throws IOException {
        List<String> lines  = Files.readAllLines(Paths.get("server.log"));

        // count total request per ip

        Map<String, Long> requestsPerIP = lines.stream()
                .map(line-> line.split(" "))
                .collect(Collectors.groupingBy(parts->parts[0],Collectors.counting()));

        System.out.println("Request per IP");
        requestsPerIP.forEach((ip, count )->
                System.out.println(ip+"-> "+count)
        );


        //top 3 urls

        Map<String, Long> urlCount =
                lines.stream()
                        .map(line -> line.split(" "))
                        .collect(Collectors.groupingBy(
                                parts -> parts[3],  // URL
                                Collectors.counting()
                        ));

        System.out.println("\nTop 3 URLs:");

        urlCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue())
                );


       //percentage for 404

        long totalRequests = lines.size();

        long error404Count =
                lines.stream()
                        .map(line -> line.split(" "))
                        .filter(parts -> parts[2].equals("404"))
                        .count();

        double percentage404 =
                (error404Count * 100.0) / totalRequests;

        System.out.println("\n404 Error Percentage: " + percentage404 + "%");
    }
}
