package com.springrest.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tanerali on 09/08/2017.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

//    @ResponseStatus(value = HttpStatus.CONFLICT, reason = "Data integrity violation")
//    @ExceptionHandler(ForecastNotFoundException.class)
//    public void forecastNotFound (){
//
//    }

    //@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Data integrity violation")
    @ResponseBody
    @ExceptionHandler(ForecastNotFoundException.class)
    public RestExceptionResponse forecastNotFound (){

        RestExceptionResponse restExceptionResponse = new RestExceptionResponse();
        restExceptionResponse.setError("error");

        return restExceptionResponse;

    }

}
