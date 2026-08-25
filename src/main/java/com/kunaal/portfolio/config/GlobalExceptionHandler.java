package com.kunaal.portfolio.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// @ControllerAdvice makes this class apply GLOBALLY, across every controller
// in the app — you don't wire it into each controller individually.
//
// @ExceptionHandler(Exception.class) says: "if any controller method throws
// an uncaught Exception, route it here instead of showing Spring's default
// ugly whitelabel error page." This is the standard pattern interviewers
// expect when they ask "how do you handle errors in a Spring Boot API?"
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Something went wrong: " + ex.getMessage());
    }
}
