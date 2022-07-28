package com.alpha.shopybeebackend.exception.exceptions.authentication;

public class EmailPasswordNotMatchingException extends RuntimeException {
    public EmailPasswordNotMatchingException(String message) {
        super(message);
    }
}
