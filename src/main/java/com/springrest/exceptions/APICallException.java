package com.springrest.exceptions;

/**
 * Created by tanerali on 11/08/2017.
 */
public class APICallException extends Exception{

    String msg;

    @Override
    public String toString() {
        return "APICallException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
