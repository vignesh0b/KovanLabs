package com.kovanlabs.intern.java.oop.enum1;

public class AdvancedEnum {
    public static void main(String[] args){
        Operation add = Operation.ADDITION;
        Operation sub = Operation.SUBTRACTION;
        Operation mul = Operation.MULTIPLICATION;
        System.out.println(add.apply(2,4));
        System.out.println(sub.apply(2,4));
        System.out.println(mul.apply(2,4));
    }
}

enum Operation{
    ADDITION{
        public double apply(double x, double y){
            return x+y;
        }
    }
    , SUBTRACTION{
        public double apply(double x, double y){
            return x-y;
        }
    }
    , MULTIPLICATION{
        public double apply(double x, double y){
            return x*y;
        }
    };
    public abstract double apply(double x, double y);
}
