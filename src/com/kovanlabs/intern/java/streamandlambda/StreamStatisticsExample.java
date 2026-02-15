package com.kovanlabs.intern.java.streamandlambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamStatisticsExample {
    public static void main(String[] args){
        List<Integer> numbers = new Random()
                .ints(100,0,1000)
                .boxed()
                .collect(Collectors.toList());

        IntSummaryStatistics stats = numbers
                .stream()
                .mapToInt(Integer :: intValue)
                .summaryStatistics();

        System.out.println(Arrays.toString(numbers.toArray()));
        System.out.println("Max: "+stats.getMax());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Sum: "+stats.getSum());

    }
}
