package com.personalstudy.msscbrewery.services.v2;

import com.personalstudy.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeerDto(BeerDtoV2 beerDto);

    void updateBeerDto(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
