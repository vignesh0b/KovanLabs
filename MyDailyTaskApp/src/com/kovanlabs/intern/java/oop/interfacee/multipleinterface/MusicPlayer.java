package com.kovanlabs.intern.java.oop.interfacee.multipleinterface;

public interface MusicPlayer {
   default void start(){
       System.out.println("Music player starts");
   }

   void play();
}
