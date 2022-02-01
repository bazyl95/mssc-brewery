package com.personalstudy.msscbrewery.services;

import com.personalstudy.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
