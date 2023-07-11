package com.example.sample;

public class InvalidOperatorException extends RuntimeException {

    public InvalidOperatorException() {
        super("only use +,-,*,/");
    }

}
