package com.kovanlabs.intern.java.oop.enum1;

public class StateMachine {
    public static void main(String[] args) throws Exception {
        Order state1 = Order.NEW;
        Order state2 = state1.next();
        Order state3 = state2.next();
        Order state4 = state3.next();
//        Order state5 = state4.next();
        System.out.println(state4);
    }
}

enum Order{
    NEW{
        @Override
        public Order next() {
            return PROCESSING;
        }
    }, PROCESSING{
        @Override
        public Order next() {
            return SHIPPED;
        }
    }, SHIPPED{
        @Override
        public Order next() {
            return DELIVERED;
        }
    }, DELIVERED{
        @Override
        public Order next() throws Exception{
            throw new IllegalAccessException("Order already delivered");
        }
    };
    public abstract Order next() throws Exception;
}
