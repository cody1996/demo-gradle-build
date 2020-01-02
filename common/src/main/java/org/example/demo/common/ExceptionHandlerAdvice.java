package org.example.demo.common;

import org.example.demo.api.dto.ErrorDTO;
import org.example.demo.exception.ErrorException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Cody
 */
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(ErrorException.class)
    public ErrorDTO errorExceptionHandler(ErrorException e) {
        return new ErrorDTO().setMessage(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ErrorDTO defaultExceptionHandler(Exception e) {
        return new ErrorDTO().setMessage("Unknown Exception");
    }
}
