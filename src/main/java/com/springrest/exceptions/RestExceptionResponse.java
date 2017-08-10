package com.springrest.exceptions;

/**
 * Created by tanerali on 09/08/2017.
 */
public class RestExceptionResponse {

    String msg;
    int httpStatusCode;
    String error;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
