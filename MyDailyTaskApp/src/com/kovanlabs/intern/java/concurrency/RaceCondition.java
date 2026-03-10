package com.kovanlabs.intern.java.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceCondition {
    //count up to 10000 using synchronized keyboard

   public static void main(String[] args){
       Counter counter = new Counter();
       Thread[] threads = new Thread[10];
       for(int i=0; i<10; i++){
           threads[i] = new Thread (new Runnable() {
               @Override
               public void run() {
                   for(int i=0; i<1000; i++){
                       counter.count();
                   }
               }
           });
           threads[i].start();
       }
       System.out.println(counter.count);

       for(int i=0; i<10; i++){
           try {
               threads[i].join();
           } catch (InterruptedException e) {
               System.out.println("Thread interrupted!");
           }
       }
       System.out.println(counter.count);
   }

}
class Counter{
    int count=0;
    public synchronized void count(){
        count++;
    }
    AtomicInteger atomicCount = new AtomicInteger(0);
    public void increment(){
        atomicCount.incrementAndGet();
    }
}

