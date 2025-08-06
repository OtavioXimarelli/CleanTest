package dev.otavio.cleanarchstudy.infrastructure.exceptions;

public class NotUniqueIdentificationException extends RuntimeException {
    public NotUniqueIdentificationException(String message) {
        super(message);
    }
}
