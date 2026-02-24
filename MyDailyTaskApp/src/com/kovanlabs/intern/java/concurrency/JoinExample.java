package com.kovanlabs.intern.java.concurrency;

public class JoinExample {
    public static void main(String[] args){
        A t1 = new A();
        t1.start();
        try{
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(t1.j);
    }

}

class A extends Thread{

    int j=0;
    public void run(){
        for(int i=0; i<50; i++){
            j=i;
        }
    }
}
