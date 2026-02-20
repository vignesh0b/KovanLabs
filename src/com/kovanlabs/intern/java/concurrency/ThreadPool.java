package com.kovanlabs.intern.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(3);

        for(int i=1; i<=10; i++){
            int taskId = i;
            service.execute(()->{
                System.out.println("Task: "+taskId+" "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Main thread gets interrupted");
                }
            });

        }
        service.shutdown();
    }
}
