package com.personalstudy.msscbrewery.services.v2;

import com.personalstudy.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeerDto(BeerDtoV2 BeerDtoV2) {
        return null;
    }

    @Override
    public void updateBeerDto(UUID beerId, BeerDtoV2 BeerDtoV2) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}