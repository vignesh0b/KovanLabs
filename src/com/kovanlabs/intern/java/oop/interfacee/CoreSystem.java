package com.kovanlabs.intern.java.oop.interfacee;

public class CoreSystem {
    Plugin[] plugins;
    CoreSystem(Plugin[] plugins){
        this.plugins=plugins;
    }

    public void run(){
        for(Plugin plugin : plugins){
            plugin.execute();
        }
    }
}
interface Plugin{
    void execute();
}

