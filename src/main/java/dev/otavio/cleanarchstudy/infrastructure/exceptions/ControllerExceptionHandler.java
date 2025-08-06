package dev.otavio.cleanarchstudy.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<Map<String, String>> handlenotuniqueidentificatorexception(NotUniqueIdentificationException exception) {
        Map<String, String> notUniqueErrorResponse = new HashMap<>();
        notUniqueErrorResponse.put("Error: ", exception.getMessage());
        notUniqueErrorResponse.put("Message: ", "The identification of this event already exists, please verify and try again.");
        return new ResponseEntity<>(notUniqueErrorResponse, HttpStatus.CONFLICT);


    }
}
