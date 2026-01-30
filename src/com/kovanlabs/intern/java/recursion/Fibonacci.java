package com.kovanlabs.intern.java.recursion;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args){
        int n=10;
        int[] db = new int[n+1];
        Arrays.fill(db, -1);
        System.out.println(fibo(db, n));
    }

    private static int fibo(int[] dp, int n) {
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=fibo(dp,n-2)+fibo(dp, n-1);
        return dp[n];
    }
}
