package com.alpha.shopybeebackend.exception.exceptions.authentication;

public class EmailNotFoundException extends RuntimeException {
    public EmailNotFoundException(String message) {
        super(message);
    }
}
