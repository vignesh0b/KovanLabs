package com.kovanlabs.intern.java.concurrency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //example for threading
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You have 5 second to enter the name");
//
//        MyRunnable myrunnable = new MyRunnable();
//        Thread thread = new Thread(myrunnable);
//        thread.setDaemon(true);
//        thread.start();
//        System.out.print("Enter name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello "+name);


        //example for multithreading

        Thread t1 = new Thread(()->{
            for(int i=1; i<=15; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Main thread was interrupted");
                }
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=1; i<=15; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Main thread was interrupted");
                }
                System.out.println(Thread.currentThread().getName());
            }
        });

        t1.start();
        t2.start();
    }
}
