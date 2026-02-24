package com.kovanlabs.intern.java.exceptionhandling;

public class AgeLimitException extends RuntimeException {
    public AgeLimitException(String message) {
        super(message);
    }
}
