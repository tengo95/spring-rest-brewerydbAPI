package com.springrest.model.HomeworkBeerDB;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by tanerali on 25/07/2017.
 */
@JsonIgnoreProperties
public class HomeworkData {

    String name;
    HomeworkBrewery[] breweries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HomeworkBrewery[] getBreweries() {
        return breweries;
    }

    public void setBreweries(HomeworkBrewery[] breweries) {
        this.breweries = breweries;
    }
}
