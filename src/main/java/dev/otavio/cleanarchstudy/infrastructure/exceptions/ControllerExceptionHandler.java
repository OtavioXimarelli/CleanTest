package dev.otavio.cleanarchstudy.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<Map<String, String>> handlenotuniqueidentificatorexception(NotUniqueIdentificationException exception) {
        Map<String, String> notUniqueErrorResponse = new LinkedHashMap<>();
        notUniqueErrorResponse.put("Error: ", exception.getMessage());
        notUniqueErrorResponse.put("Message: ", "The identification of this event already exists, please verify and try again.");
        return new ResponseEntity<>(notUniqueErrorResponse, HttpStatus.CONFLICT);
    }


    @ExceptionHandler
    public ResponseEntity<Object> handleNotFoundException(NotFoundEventException exception) {
        Map<String, Object> notFoundResponse = new LinkedHashMap<>();
        notFoundResponse.put("Error: ", exception.getMessage());
        notFoundResponse.put("Message: ", "Verify and try again with the correct identification.");
        notFoundResponse.put("Timestamp: ", LocalDateTime.now());
        notFoundResponse.put("Status: ", HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<>(notFoundResponse, HttpStatus.NOT_FOUND);
    }
}
