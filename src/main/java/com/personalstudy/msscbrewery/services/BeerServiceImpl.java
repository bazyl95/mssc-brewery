package com.personalstudy.msscbrewery.services;

import com.personalstudy.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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
        log.info("Updating a beer....");
    }

    @Override
    public void deleteById(UUID beerId) {
        //TODO: impl -would add a real impl to delete beer
        log.info("Deleting a beer...");
    }
}
