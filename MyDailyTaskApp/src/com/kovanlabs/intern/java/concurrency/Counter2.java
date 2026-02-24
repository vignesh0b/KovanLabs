package com.kovanlabs.intern.java.concurrency;

public class Counter2 {
    public static int count=0;

    public static void main(String[] args){
//        for(int i=0; i<10; i++){
//            Thread t = new Thread(new CounterThread());
//            t.start();
//        }

//        Thread t1 = new Thread(new CounterThread());
//        t1.start();
//        Thread t2 = new Thread(new CounterThread());
//        t2.start();
//        Thread t3 = new Thread(new CounterThread());
//        t3.start();
//        Thread t4 = new Thread(new CounterThread());
//        t4.start();
//        Thread t5 = new Thread(new CounterThread());
//        t5.start();
//        Thread t6 = new Thread(new CounterThread());
//        t6.start();

        Thread[] threads = new Thread[10];
        for(int i=0; i<10; i++){
            threads[i] = new Thread (new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i<1000; i++){
                        count++;
                    }
                }
            });
            threads[i].start();
        }
        System.out.println(count);

        for(int i=0; i<10; i++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
        System.out.println(count);
    }
}
