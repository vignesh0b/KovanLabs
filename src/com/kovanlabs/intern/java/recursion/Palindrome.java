package com.kovanlabs.intern.java.recursion;

public class Palindrome {
    private static boolean isPalindrome(String s){
        if(s.length()<=1){
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }

        return isPalindrome(s.substring(1,s.length()-1));
    }

    private static boolean isPalindrome(String s, int start, int end){
        if(start>=end){
            return true;
        }

        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }

        return isPalindrome(s,start+1, end-1);
    }


    public static void main(String[] args){

        String str = "malayalam";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
