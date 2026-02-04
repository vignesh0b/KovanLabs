package com.kovanlabs.intern.java.oop.interfacee.multipleinterface;

public interface Camera {
    default void start(){
        System.out.println("Camera starts");
    }

    void click();
}
