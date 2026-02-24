package com.kovanlabs.intern.java.basics;

public class SieveOfEratosthenes {

    public static void main(String[] args){
        SieveOfEratosthenes s = new SieveOfEratosthenes();
        s.sieveOfEratosthenes(1000);
    }

    void sieveOfEratosthenes(int n){
        boolean[] prime = new boolean[n+1];

        for(int i=0; i<=n; i++){
            prime[i]=true;
        }

        for(int i=2; i*i<=n; i++){
            if(prime[i]) {
                for (int j = i*i; j <= n; j += i) {
                    prime[j]=false;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(prime[i]==true){
                System.out.print(i+" ");
            }
        }
    }

}
