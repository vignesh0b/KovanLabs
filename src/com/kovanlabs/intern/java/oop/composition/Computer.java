package com.kovanlabs.intern.java.oop.composition;

public class Computer {
    private Processor processor;
    private Ram ram;
    private Storage storage;

    Computer(Processor processor, Ram ram, Storage storage){
            this.processor = processor;
            this.ram = ram;
            this.storage = storage;
    }

    public void processorSpec(){
        processor.spec();
    }
    public void ramSpec(){
        ram.spec();
    }
    public void storageSpec(){
        storage.spec();
    }
    public void spec(){
        processor.spec();
        ram.spec();
        storage.spec();
    }

    public void upgradeRam(Ram ram){
        this.ram = ram;
    }


}
