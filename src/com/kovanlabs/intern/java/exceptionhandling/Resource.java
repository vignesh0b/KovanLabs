package com.kovanlabs.intern.java.exceptionhandling;

public class Resource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Resource closed");
    }

    public void doSomething(){
        System.out.println("Hello ");
    }
}
class Test{
    public static void main(String[] args){
        try(Resource rs = new Resource()){
            rs.doSomething();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}