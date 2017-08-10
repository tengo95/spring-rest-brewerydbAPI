package com.springrest.model.HomeworkBeerDB;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by tanerali on 25/07/2017.
 */

@JsonIgnoreProperties
public class HomeworkBeer {

    String message;
    HomeworkData data;
    String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HomeworkData getData() {
        return data;
    }

    public void setData(HomeworkData data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
