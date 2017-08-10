package com.springrest.model.HomeworkBeerDB;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by tanerali on 25/07/2017.
 */
@JsonIgnoreProperties
public class HomeworkLocation {

    String locality;
    String region;

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
