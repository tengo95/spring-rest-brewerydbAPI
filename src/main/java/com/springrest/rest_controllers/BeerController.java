package com.springrest.rest_controllers;

import com.springrest.exceptions.APICallException;
import com.springrest.model.Beer;
import com.springrest.model.HomeworkBeer2;
import com.springrest.model.HomeworkBeerDB.HomeworkBeer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tanerali on 25/07/2017.
 */

@RestController
public class BeerController {

    @Autowired
    RestTemplate restTemplate;

    private static final Logger log = LoggerFactory.getLogger(BeerController.class);

    @RequestMapping("/beer/random")
    public Beer getRandomBeer() throws APICallException {
        try {
            Beer beer = restTemplate.getForObject(
                    "http://api.brewerydb.com/v2/beer/random?key=555b3a6999068ef21a9075893a4524a6", Beer.class);

            log.info(beer.toString());
            return beer;

        } catch (Exception apiCallExc) {
            throw new APICallException();
        }

    }

    @RequestMapping("/beer/randomWithBrewery")
    public HomeworkBeer2 getRandomBeerBrewery() throws APICallException {

        try {
            Beer beer = restTemplate.getForObject(
                    "http://api.brewerydb.com/v2/beer/random?key=555b3a6999068ef21a9075893a4524a6", Beer.class);

            String beerID = beer.getData().getId();

//        Beer beerWithBrewery = restTemplate.getForObject(
//                "http://api.brewerydb.com/v2/beer/"+ beerID+"?withBreweries=Y&key=555b3a6999068ef21a9075893a4524a6",
//                Beer.class);
//        log.info(beerWithBrewery.toString());

            HomeworkBeer homeworkBeer = restTemplate.getForObject(
                    "http://api.brewerydb.com/v2/beer/"+ beerID+"?withBreweries=Y&key=555b3a6999068ef21a9075893a4524a6",
                    HomeworkBeer.class);

            HomeworkBeer2 hwBeer = new HomeworkBeer2(homeworkBeer);

            return hwBeer;

        } catch (Exception apiCallExc) {
            throw new APICallException();
        }

    }
}
