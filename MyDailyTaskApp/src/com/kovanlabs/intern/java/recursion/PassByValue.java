package com.kovanlabs.intern.java.recursion;

public class PassByValue {

    private static void change(int n){
        n=101;
    }

    private static void  change(Student s){
        s.mark = 101;
    }


    public static void main(String[] args){
        int a = 10;
        change(a); // Here java only send the copy of the value  not the reference
        System.out.println(a);

        Student s1 = new Student();
        s1.mark = 59;
        change(s1); // when the object is passed to a method java sends the value stored in the variable but the value is the reference of the object
        System.out.println(s1.mark);

    }

}

class Student{
    int mark;
}
