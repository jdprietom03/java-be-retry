package com.bootcamp.Joyeria.exceptions;

public class ErrorException extends RuntimeException{
    public ErrorException() {
    }

    public ErrorException(String message) {
        super(message);
    }
}
