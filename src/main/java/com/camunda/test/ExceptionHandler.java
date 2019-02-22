package com.camunda.test;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ControllerAdvice
public class ExceptionHandler {

    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Not all mandatory fields are filled")
    @org.springframework.web.bind.annotation.ExceptionHandler(HttpServerErrorException.class)
    public String assertionException(final HttpServerErrorException e) {
        System.out.println("BIG ERROR OF YOUR LIFE " +e.getMessage());
        return null;
    }
}
