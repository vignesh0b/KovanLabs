package com.kovanlabs.intern.java.streamandlambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5,4,7,1,3);
        list.stream()
                .filter(n->n%2==1)
                .map(n->n*2)
                .forEach(n -> System.out.print(n+" "));


        list.stream().
                map(n-> {System.out.println("hello");return n*2;})
                .reduce(0,(e,c)->e+c);


        System.out.println();
        int sum = list.stream()
                .filter(n->n%2==1)
                .map(n->n*2)
                .reduce(0,(e,c)->(e+c))
                ;

        System.out.println(sum);

        //Predicate

//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer%2==0;
//            }
//        };
        Predicate<Integer> predicate = n -> n%2==0;

        //Consumer

        Consumer<String> consumer = name -> System.out.println("hello everyone i am "+name);
        consumer.accept("vignesh");

       //Function
        Function<Integer, String> convert = n-> "Number is: "+n;
        System.out.println(convert.apply(19));

        //Supplier
        Supplier<Double> randomValue = ()-> Math.random();
        System.out.println(randomValue.get());

//        Calculator add = (a,b) -> (a+b);
//        System.out.println(add.operate(10,3));

        List<List<String>> list23 = List.of(
                List.of("java","python"),
                List.of("c", "php")
        );

        //flatmap
        //flatmap is used to flatten the nested structure and convert into single stream

        list23.stream()
                .flatMap(l-> l.stream())
                .forEach(System.out::println);
    }
}
