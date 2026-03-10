package com.kovanlabs.intern.java.concurrency;

public class CounterThread  implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            Counter2.count ++;
        }
    }
}
