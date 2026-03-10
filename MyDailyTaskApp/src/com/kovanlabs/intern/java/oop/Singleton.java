package com.kovanlabs.intern.java.oop;

public class Singleton {
    public static void main(String[] args){
        AppConfig a1 = AppConfig.getInstance();
        System.out.println(a1.s);
        a1.s = "I am in a1 reference";
        AppConfig a2 = AppConfig.getInstance();
        System.out.println(a2.s);
    }
}
class AppConfig{
    private static AppConfig instance = null;

    public String s;

    private AppConfig(){
        s = "I am Singleton class";
    }

    public static AppConfig getInstance(){
        if(instance == null){
            instance = new AppConfig();
        }
        return instance;
    }
}
