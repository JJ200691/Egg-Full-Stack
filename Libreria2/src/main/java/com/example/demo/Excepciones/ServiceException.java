package com.example.demo.Excepciones;

public class ServiceException extends Exception {

    public ServiceException() {
    }

    public ServiceException(String msg) {
        super(msg);
    }
}
