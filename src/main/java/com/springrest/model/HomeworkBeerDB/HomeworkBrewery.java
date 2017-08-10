package com.springrest.model.HomeworkBeerDB;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by tanerali on 25/07/2017.
 */
@JsonIgnoreProperties
public class HomeworkBrewery {

    String name;
    HomeworkLocation[] locations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HomeworkLocation[] getLocations() {
        return locations;
    }

    public void setLocations(HomeworkLocation[] locations) {
        this.locations = locations;
    }
}
