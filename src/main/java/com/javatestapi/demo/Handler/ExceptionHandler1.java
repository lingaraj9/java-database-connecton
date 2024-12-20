package com.javatestapi.demo.Handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class ExceptionHandler1 {

    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<String> handleHttpServerErrorException(HttpServerErrorException ex, WebRequest req) {
        String httpMessage = ex.getMessage() == null ? "Somthin worng"
                : ex.getMessage().replace(String.valueOf(ex.getStatusCode().value()), "").trim();
        return ResponseEntity.status(ex.getStatusCode())
                .body(httpMessage);
    }
}
