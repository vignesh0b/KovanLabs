package com.kovanlabs.intern.java.oop.interfacee;

public class Main {
    public static void main(String[] args){
        Plugin[] plugins = {
                new Plugin() {
            @Override
            public void execute() {
                System.out.println("Authentication Plugin");
            }

            },
                new Plugin() {
                 @Override
                 public void execute() {
                     System.out.println("Authorizer Plugin");
                 }

                 },
                new Plugin() {
                    @Override
                    public void execute() {
                        System.out.println("Logging Plugin");
                    }
                },
                ()-> System.out.println("Lombok Plugin")

        };

        CoreSystem cs = new CoreSystem(plugins);
        cs.run();
    }
}
