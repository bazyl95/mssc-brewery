package com.personalstudy.msscbrewery.services;

import com.personalstudy.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeerDto(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeerDto(UUID beerId, BeerDto beerDto) {
        //TODO: impl -would add a real impl to update beer
    }

    @Override
    public void deleteBeerDto(UUID beerId) {
        //TODO: impl -would add a real impl to delete beer
    }
}
