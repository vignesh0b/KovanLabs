package com.kovanlabs.intern.java.generics;

import java.util.Arrays;

public class GenericStack {

    public static void main(String[] args){
        MyStack<Integer> stack = new MyStack<>();
        for (int i=0; i<21; i++){
            stack.add(i+1);
        }
        System.out.println(Arrays.toString(stack.returnArray()));
        System.out.println(stack.get(3));
    }
}
class MyStack<T>{
    private int DEFAULT_SIZE = 10;
    private static int size=0;


    public Object[] arr;

    public MyStack() {
        this.arr = new Object[DEFAULT_SIZE];
    }

    public void add(T value){
        if(size == arr.length){
            resize();
        }

        arr[size++] = value;
    }

    public T get(int index){
        T t = (T) arr[index];
        return t;
    }

    public T[] returnArray(){
        return (T[]) arr;
    }

    private void resize(){
        Object[] temp = new Object[2*size];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;

    }

}
