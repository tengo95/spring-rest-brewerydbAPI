package com.springrest.exceptions;

/**
 * Created by tanerali on 09/08/2017.
 */
public class DatabaseAccessException extends Throwable {

    String msg;

    @Override
    public String toString() {
        return "DatabaseAccessException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
