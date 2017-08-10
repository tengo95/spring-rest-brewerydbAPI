package com.springrest.exceptions;

/**
 * Created by tanerali on 09/08/2017.
 */
public class DatabaseAccessException extends RuntimeException {

    String msg;

    @Override
    public String toString() {
        return "DatabaseAccessException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
