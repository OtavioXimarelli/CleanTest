package dev.otavio.cleanarchstudy.core.entities;

public class NotUniqueIdentificationException extends RuntimeException {
    public NotUniqueIdentificationException(String message) {
        super(message);
    }
}
