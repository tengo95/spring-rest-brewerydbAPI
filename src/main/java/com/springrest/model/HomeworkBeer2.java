package com.springrest.model;

import com.springrest.model.HomeworkBeerDB.HomeworkBeer;

/**
 * Created by tanerali on 26/07/2017.
 */
public class HomeworkBeer2 {
    String name;
    String brewery;
    String city;
    String state;


    public HomeworkBeer2(HomeworkBeer beer) {
        this.name = beer.getData().getName();
        this.brewery = beer.getData().getBreweries()[0].getName();
        this.city = beer.getData().getBreweries()[0].getLocations()[0].getLocality();
        this.state = beer.getData().getBreweries()[0].getLocations()[0].getRegion();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
