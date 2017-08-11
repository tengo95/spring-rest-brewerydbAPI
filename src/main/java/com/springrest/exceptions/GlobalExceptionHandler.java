package com.springrest.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tanerali on 09/08/2017.
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ResponseBody
    @ExceptionHandler(APICallException.class)
    public RestExceptionResponse unableToCallAPI (){

        RestExceptionResponse restExceptionResponse = new RestExceptionResponse();
        restExceptionResponse.setError("Unable to call API");

        return restExceptionResponse;

    }

}
