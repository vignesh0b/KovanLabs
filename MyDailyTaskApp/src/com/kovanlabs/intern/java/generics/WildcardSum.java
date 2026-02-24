package com.kovanlabs.intern.java.generics;

import java.util.List;

import java.util.Arrays;
import java.util.List;

public class  WildcardSum{
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5);

        System.out.println(sumList(intList));    // 60.0
        System.out.println(sumList(doubleList)); // 61.5
    }

    public static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}

