package com.bhaskarmantrala.hub.springbootjpa.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author venkata.mantrala
 */
@RestControllerAdvice
@Component
public class CustomRestControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationError(MethodArgumentNotValidException exception) {
        Map<String, String> responseMap = new HashMap<>();
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        fieldErrors.forEach(fieldError -> responseMap.put(fieldError.getField(), fieldError.getDefaultMessage()));
        return new ResponseEntity<>(responseMap, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Map<String, String>> enumConstantsValidationError(HttpMessageNotReadableException exception) {
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("error", exception.getMostSpecificCause().getMessage());
        return new ResponseEntity<>(responseMap, HttpStatus.BAD_REQUEST);
    }

}
