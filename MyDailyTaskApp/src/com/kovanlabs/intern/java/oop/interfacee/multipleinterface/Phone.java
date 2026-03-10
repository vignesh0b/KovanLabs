package com.kovanlabs.intern.java.oop.interfacee.multipleinterface;

public interface Phone {
   default void start(){
       System.out.println("Phone starts");
   }

   void call();
}
