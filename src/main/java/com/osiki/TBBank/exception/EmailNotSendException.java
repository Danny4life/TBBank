package com.osiki.TBBank.exception;

public class EmailNotSendException extends RuntimeException{
    public EmailNotSendException(String message) {
        super(message);
    }
}
